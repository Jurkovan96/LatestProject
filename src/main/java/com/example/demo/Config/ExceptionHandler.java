package com.example.demo.Config;

public class ExceptionHandler extends RuntimeException {

    private String code;

    public String getCode() {
        return code;
    }

    public ExceptionHandler(String code) {
        this.code = code;
    }
}
