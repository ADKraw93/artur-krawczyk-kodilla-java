package com.kodilla.testing.shape;

public record Circle (double field) implements Shape {
    public static String name = "Circle";

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return field;
    }
}
