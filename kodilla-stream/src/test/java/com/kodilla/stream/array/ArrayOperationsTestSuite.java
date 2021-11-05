package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] arrayOfNumbers = {1,2,3,4,5,6,7,8,9,10,20,21,22,23,24,50};

        //When
        double resultObtained = getAverage(arrayOfNumbers);
        double expectedResult = 13.4375;

        //Then
        Assertions.assertEquals(expectedResult, resultObtained);
    }
}
