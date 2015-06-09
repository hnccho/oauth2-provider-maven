package com.porterhead.user.exception;

import com.porterhead.exception.BaseWebApplicationException;

/**
 * @version 1.0
 * @author: Iain Porter
 * @since 13/05/2013
 */
public class TokenHasExpiredException extends BaseWebApplicationException {

	private static final long serialVersionUID = 1L;

	public TokenHasExpiredException() {
        super(403, "Token has expired", "An attempt was made to load a token that has expired");
    }
}
