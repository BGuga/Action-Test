package com.example.demo;

import com.example.demo.controller.AnyController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AnyTest2 {

    @Autowired
    AnyController anyController;


    @Test
    public void anyTest(){
        assertThat(1).isEqualTo(10);

    }
}
