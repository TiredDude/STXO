package com.dev.game.dao.exceptions;

import java.lang.Math;

/**
 * The Class DaoException.
 */
@SuppressWarnings("serial")
public class DaoException extends RuntimeException {

    public DaoException(String message, Throwable cause) {
	super(message, cause);
    }

    public DaoException(Throwable cause) {
	super(cause);
    }
}
