package com.template.microservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.template.microservice")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
