package com.antonialucianapires.petshop.exceptions;

public class ObjetoNaoEncontradoException extends RuntimeException {
    private static final long serialVersionUID = 7052015994145577984L;

    public ObjetoNaoEncontradoException(String message) {
        super(message);
    }

    public ObjetoNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
