package com.springboot.exceptionhandling.exceptions;


import java.io.Serial;

//This is a custom exception
public class NoBookFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1288300478531775788L;

    public NoBookFoundException(String msg) {
        super(msg);
    }
}
