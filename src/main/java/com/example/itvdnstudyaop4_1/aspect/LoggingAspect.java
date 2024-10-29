package com.example.itvdnstudyaop4_1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.itvdnstudyaop4_1.service" +
            ".CalculatorService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Executing method: " + methodName);
        System.out.println("Arguments: " + arrayToString(args));
        System.out.println();
    }

    @After("execution(* com.example.itvdnstudyaop4_1.service" +
            ".CalculatorService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Finished execution: " + methodName);
        System.out.println();
    }

    @AfterThrowing(value = "execution(* com.example.itvdnstudyaop4_1" +
            ".service.CalculatorService.*(..))", throwing = "exception")
    public void logAfterThrow(JoinPoint joinPoint, Throwable exception) {
        System.out.println("Exception was thrown in method "
                + joinPoint.getSignature().getName());
        System.out.println("Class " + joinPoint.getTarget().getClass().getName());
        System.out.println("Exception " + exception.getMessage());
        System.out.println();
    }

    private String arrayToString(Object[] arr) {
        StringBuilder result = new StringBuilder("[");
        for (Object obj : arr) {
            result.append(obj).append(", ");
        }
        if (arr.length > 0) {
            result.setLength(result.length() - 2);  // Remove the trailing comma and space
        }
        result.append("]");
        return result.toString();
    }
}
