package com.example.demo.Config;

public class ExceptionHandler extends RuntimeException {

    private String code;


    public String getCode() {
        return code;
    }

    public ExceptionHandler(String code) {
        this.code = code;
    }

    public ExceptionHandler(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }
}
