package com.dio.live;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiveApplication {               //esse é o entry point da aplicação, sempre vai iniciar por essa classe

    public static void main(String[] args) {
        SpringApplication.run(LiveApplication.class, args);
    }

}
