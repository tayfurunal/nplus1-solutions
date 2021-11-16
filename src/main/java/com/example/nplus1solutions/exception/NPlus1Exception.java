package com.example.nplus1solutions.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class NPlus1Exception extends RuntimeException {

    private final String key;
    private final String[] args;
    private final HttpStatus httpStatus;

    public NPlus1Exception(String key, HttpStatus httpStatus, String... args) {
        this.key = key;
        this.httpStatus = httpStatus;
        this.args = args;
    }

    public NPlus1Exception(String key, HttpStatus httpStatus) {
        this.key = key;
        this.httpStatus = httpStatus;
        this.args = new String[0];
    }
}