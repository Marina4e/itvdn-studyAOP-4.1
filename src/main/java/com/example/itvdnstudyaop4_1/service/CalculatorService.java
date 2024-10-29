package com.example.itvdnstudyaop4_1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            int result = a / b;
            return result;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}
