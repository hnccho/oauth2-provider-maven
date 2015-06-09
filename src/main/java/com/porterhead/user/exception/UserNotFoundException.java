package com.porterhead.user.exception;

import com.porterhead.exception.BaseWebApplicationException;

/**
 * @version 1.0
 * @author: Iain Porter
 * @since 13/05/2013
 */
public class UserNotFoundException extends BaseWebApplicationException {

 	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
        super(404, "User Not Found", "No User could be found for that Id");
    }
}
