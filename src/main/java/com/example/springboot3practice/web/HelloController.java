package com.example.springboot3practice.web;

import com.example.springboot3practice.web.dto.HelloControllerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloControllerDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        HelloControllerDto helloDto = new HelloControllerDto(name, amount);
        return helloDto;
    }

}
