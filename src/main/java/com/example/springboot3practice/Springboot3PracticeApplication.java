package com.example.springboot3practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Springboot3PracticeApplication {

    public static void main(String[] args) {

        SpringApplication.run(Springboot3PracticeApplication.class, args);
    }

}
