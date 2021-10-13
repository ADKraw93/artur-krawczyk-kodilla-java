package com.kodilla.testing.shape;

public record Triangle(double field) implements Shape {
    public static String name = "Triangle";

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return field;
    }
}
