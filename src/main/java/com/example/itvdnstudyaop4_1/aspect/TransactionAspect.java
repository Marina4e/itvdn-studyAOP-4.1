package com.example.itvdnstudyaop4_1.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionAspect {

    @AfterReturning
            (pointcut = "execution(* com.example.itvdnstudyaop4_1" +
                    ".service.CalculatorService.*(..))",
                    returning = "result")
    public void afterReturning(Object result) {
        System.out.println("Transaction completed. Result: " + result);
        System.out.println();
    }
}
