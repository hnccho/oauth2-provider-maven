package com.porterhead.user.exception;

import com.porterhead.exception.BaseWebApplicationException;

/**
 * @version 1.0
 * @author: Iain Porter
 * @since 13/05/2013
 */
public class TokenNotFoundException extends BaseWebApplicationException {

	private static final long serialVersionUID = 1L;

	public TokenNotFoundException() {
        super(404, "Token Not Found", "No token could be found for that Id");
    }
}
