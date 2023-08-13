package com.example.springboot3practice.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloControllerDto {
    private final String name;
    private final int amount;
}
