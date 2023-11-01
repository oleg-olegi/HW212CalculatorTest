package com.example.hw212calculatortest.exceptions;

public class DivideByZeroException extends IllegalArgumentException {
    public DivideByZeroException(String message) {
        super(message);
    }
}
