package com.platform.jpa.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class    JpaHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaHibernateApplication.class, args);

        System.out.println("Successfully started the application");
        System.out.println("Application is running on http://localhost:8080/api/employees");
    }

}
