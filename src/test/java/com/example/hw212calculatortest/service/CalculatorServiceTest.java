package com.example.hw212calculatortest.service;

import com.example.hw212calculatortest.exceptions.DivideByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void sum() {
        int sum1 = calculatorService.sum(5, 7);
        assertEquals(5 + 7, sum1);
        int sum2 = calculatorService.sum(123, 7);
        assertEquals(123 + 7, sum2);
    }

    @Test
    void subtraction() {
        int sub1 = calculatorService.subtraction(5, 7);
        assertEquals(5 - 7, sub1);
        int sub2 = calculatorService.subtraction(123, 7);
        assertEquals(123 - 7, sub2);
    }

    @Test
    void multiply() {
        int multiply1 = calculatorService.multiply(5, 7);
        assertEquals(5 * 7, multiply1);
        int multiply2 = calculatorService.multiply(123, 7);
        assertEquals(123 * 7, multiply2);
    }

    @Test
    void divide() {
        int divide1 = calculatorService.divide(5, 7);
        assertEquals(5 / 7, divide1);
        int divide2 = calculatorService.divide(123, 7);
        assertEquals(123 / 7, divide2);
        Assertions.assertThrows(DivideByZeroException.class, () -> calculatorService.divide(7, 0));
    }

}