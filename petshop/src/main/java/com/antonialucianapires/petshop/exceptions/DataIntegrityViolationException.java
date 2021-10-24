package com.antonialucianapires.petshop.exceptions;

public class DataIntegrityViolationException extends RuntimeException {
    private static final long serialVersionUID = -6998438393164481670L;

    public DataIntegrityViolationException(String message) {
        super(message);
    }

    public DataIntegrityViolationException(String message, Throwable cause) {
        super(message, cause);
    }
}
