package com.anibal_guijarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping; // FALTA IMPORT
import org.springframework.web.bind.annotation.RestController; // FALTA IMPORT

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping
    public String helloWorld() {
        return "Hello World - Spring Boot";
    }

}
