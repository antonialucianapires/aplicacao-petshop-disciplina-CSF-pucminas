package com.antonialucianapires.petshop.exceptions;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class StandardError implements Serializable {

    private static final long serialVersionUID = -4630375159194030649L;
    private int status_code;
    private String message;

    public StandardError() {
    }

    public StandardError(int status_code, String message) {
        this.status_code = status_code;
        this.message = message;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
