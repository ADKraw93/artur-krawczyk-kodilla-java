package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;
    double result;

    @Test
    public void testAdd(){
        //Given
        //When
        result = calculator.add(1.5, 2.5);
        //Then
        assertEquals(result, 4);
    }

    @Test
    public void testSub(){
        //Given
        //When
        result = calculator.sub(1.5, 2.5);
        //Then
        assertEquals(result, -1);
    }

    @Test
    public void testMul(){
        //Given
        //When
        result = calculator.mul(0.5, 3);
        //Then
        assertEquals(result, 1.5);
    }

    @Test
    public void testDiv(){
        //Given
        //When
        result = calculator.div(3, 2);
        //Then
        assertEquals(result, 1.5);
    }

}
