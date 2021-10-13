package com.kodilla.testing.shape;

public record Square(double field) implements Shape {
    public static String name = "Square";

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return field;
    }
}
