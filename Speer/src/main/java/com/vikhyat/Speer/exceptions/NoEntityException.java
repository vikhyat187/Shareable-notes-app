package com.vikhyat.Speer.exceptions;

public class NoEntityException extends RuntimeException{

    public NoEntityException(String message) {
        super(message);
    }

    public NoEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoEntityException(Throwable cause) {
        super(cause);
    }
}