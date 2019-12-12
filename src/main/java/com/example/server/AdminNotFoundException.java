package com.example.server;

public class AdminNotFoundException extends RuntimeException {
    public AdminNotFoundException(Integer id) {
        super("Could not find Admin " + id);
    }
}
