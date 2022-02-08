package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    Board board;

    @Test
    void testBoard(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        boolean boardExists = context.containsBean("getBoard");

        //When & Then
        assertTrue(boardExists);
    }


    @Test
    void testTheList(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        boolean doneListExists = context.containsBean("theList");

        //When & Then
        assertTrue(doneListExists);
    }



    @Test
    void testTaskAdd(){
        //Given

        //When
        board.addToDoTask("Task to do");
        board.addInProgressTask("Task in progress");
        board.addDoneTask("Task done");

        //Then
        board.readToDoList();
        board.readInProgressList();
        board.readDoneList();
    }
}
