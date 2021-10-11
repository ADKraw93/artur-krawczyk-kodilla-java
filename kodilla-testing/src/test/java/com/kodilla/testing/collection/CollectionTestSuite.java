package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When run an exterminate method with an emp[ty ArrayList " +
            "then result ArrayList should empty"
    )
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> testList = new ArrayList<>();
        //When
        List<Integer> resultList = exterminator.exterminate(testList);
        System.out.println("Testing empty list");
        //Then
            Assertions.assertTrue(resultList.isEmpty());
        System.out.println(resultList);
    }

    @DisplayName("When run an exterminate method with an ArrayList of integers 0-4 " +
            "then result ArrayList should contain only Even Numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList (){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        Integer array[] = new Integer[] {0, 1, 2, 3, 4};
        List<Integer> testList = Arrays.asList(array);
        //When
        List<Integer> resultList = exterminator.exterminate(testList);
        System.out.println("Testing real list");
        //Then
        for(Integer number: resultList){
            Assertions.assertTrue(number%2==0);
        }
        System.out.println(resultList);
    }
}
