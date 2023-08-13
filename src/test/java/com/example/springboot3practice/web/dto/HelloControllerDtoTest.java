package com.example.springboot3practice.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class HelloControllerDtoTest {

    @Test
    public void HelloControllerDto테스트() {
        // given
        String name = "test";
        int amount = 1000;

        //when
        HelloControllerDto helloControllerDto = new HelloControllerDto(name, amount);

        //then
        assertThat(helloControllerDto.getName()).isEqualTo(name);
        assertThat(helloControllerDto.getAmount()).isEqualTo(amount);

    }
}