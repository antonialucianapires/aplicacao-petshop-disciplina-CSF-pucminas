package com.antonialucianapires.petshop.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjetoNaoEncontradoException.class)
    public ResponseEntity<StandardError> handleObjetoNaoEncontradoException(ObjetoNaoEncontradoException naoEncontradoException) {
        StandardError standardError = new StandardError(HttpStatus.NOT_FOUND.value(), naoEncontradoException.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<StandardError> handleObjetoNaoEncontradoException(DataIntegrityViolationException dataIntegrityViolationException) {
        StandardError standardError = new StandardError(HttpStatus.BAD_REQUEST.value(), dataIntegrityViolationException.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);
    }

}
