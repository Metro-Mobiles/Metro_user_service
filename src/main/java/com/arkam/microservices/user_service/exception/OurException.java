package com.arkam.microservices.user_service.exception;

public class OurException extends RuntimeException {
    public OurException(String message) {
        super(message);
    }
}
