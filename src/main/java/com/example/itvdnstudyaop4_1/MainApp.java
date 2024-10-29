package com.example.itvdnstudyaop4_1;


import com.example.itvdnstudyaop4_1.config.AppConfig;
import com.example.itvdnstudyaop4_1.service.CalculatorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        // Завантаження конфігурації Spring
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Отримання біна CalculatorService
        CalculatorService calculatorService = context.getBean(CalculatorService.class);

        // Виклик методів калькулятора для демонстрації логування та транзакцій
        int sum = calculatorService.add(5, 3);
        System.out.println("Sum: " + sum);

        int difference = calculatorService.subtract(8, 4);
        System.out.println("Difference: " + difference);

        int product = calculatorService.multiply(6, 7);
        System.out.println("Product: " + product);

        try {
            int quotient = calculatorService.divide(9, 3);
            System.out.println("Quotient: " + quotient);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        calculatorService.divide(3, 1);
    }
}
