package com.example.nplus1solutions.exception;

import org.springframework.http.HttpStatus;

public class NPlus1NotFoundException extends NPlus1Exception {

    public NPlus1NotFoundException(String key) {
        super(key, HttpStatus.NOT_FOUND);
    }
}
