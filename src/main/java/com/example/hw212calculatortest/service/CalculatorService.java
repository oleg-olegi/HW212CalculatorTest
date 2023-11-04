package com.example.hw212calculatortest.service;

import com.example.hw212calculatortest.exceptions.DivideByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ServiceInterface {
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideByZeroException("Делить на ноль нельзя, дружок");
        }
        return num1 / num2;
    }
}

