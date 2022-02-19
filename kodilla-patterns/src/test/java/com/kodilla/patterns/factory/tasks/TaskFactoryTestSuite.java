package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(taskFactory.DRIVING_TASK);

        //Then
        task.executeTask();
        assertEquals("Holliday trip", task.getTaskName());
        assertEquals(true, task.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(taskFactory.PAINTING_TASK);

        //Then
        task.executeTask();
        assertEquals("Bedroom renovation", task.getTaskName());
        assertEquals(true, task.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(taskFactory.SHOPPING_TASK);

        //Then
        task.executeTask();
        assertEquals("Vitamin shot", task.getTaskName());
        assertEquals(true, task.isTaskExecuted());
    }
}
