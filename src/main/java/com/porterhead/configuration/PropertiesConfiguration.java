package com.porterhead.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
public class PropertiesConfiguration {

    private final boolean IGNORE_UNRESOLVABLE_PLACEHOLDERS = true;

    @Bean
    public PropertySourcesPlaceholderConfigurer getProperties() {

        String profile= System.getProperty("spring.profiles.active", "default");
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new Resource[ ] 
        		{ 
        			new ClassPathResource( "properties/application.properties" ),
        			new ClassPathResource( "properties/app-" + profile + ".properties" ),
        			new FileSystemResource(System.getProperty("PROPERTY_FILE_LOCATION", ""))
        		};
        pspc.setLocations( resources );
        pspc.setIgnoreUnresolvablePlaceholders(IGNORE_UNRESOLVABLE_PLACEHOLDERS);
        pspc.setIgnoreResourceNotFound(true);
        return pspc;
    }
}