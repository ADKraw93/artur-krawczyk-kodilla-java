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

    @Test
    void testBoard(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        boolean boardExists = context.containsBean("getBoard");

        //When & Then
        assertTrue(boardExists);
    }

    @Test
    void testToDoList(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        boolean toDoListExists = context.containsBean("toDoList");

        //When & Then
        assertTrue(toDoListExists);
    }

    @Test
    void testInProgressList(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        boolean inProgressListExists = context.containsBean("inProgressList");

        //When & Then
        assertTrue(inProgressListExists);
    }

    @Test
    void testDoneList(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        boolean doneListExists = context.containsBean("doneList");

        //When & Then
        assertTrue(doneListExists);
    }

    @Autowired
    Board board;

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
