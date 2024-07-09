package com.example.postservice.exception;

import jakarta.security.auth.message.AuthException;

public class UsernameAlreadyExistException extends AuthException {

    public UsernameAlreadyExistException(String msg) {
        super(msg);
    }

    public UsernameAlreadyExistException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
