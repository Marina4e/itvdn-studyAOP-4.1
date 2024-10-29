package com.example.itvdnstudyaop4_1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.itvdnstudyaop4_1")
@EnableAspectJAutoProxy
public class AppConfig {
    // Можна визначити інші біни та налаштування тут, якщо потрібно
}
