package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {
    public static final String DRIVING_TASK     = "DRIVING TASK";
    public static final String PAINTING_TASK    = "PAINTING TASK";
    public static final String SHOPPING_TASK    = "SHOPPING TASK";

    public final Task makeTask(final String taskType) {
        switch(taskType) {
            case DRIVING_TASK:
                return new DrivingTask("Holliday trip", "Paris", "car");
            case PAINTING_TASK:
                return new PaintingTask("Bedroom renovation", "yellow", "bedroom");
            case SHOPPING_TASK:
                return new ShoppingTask("Vitamin shot", "oranges", 2.0);
            default:
                return null;
        }
    }
}
