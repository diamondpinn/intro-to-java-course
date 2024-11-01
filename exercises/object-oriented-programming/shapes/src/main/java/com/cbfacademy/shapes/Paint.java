package com.cbfacademy.shapes;

public class Paint {
    private double coverage; // Square feet covered per gallon

    // Constructor
    public Paint(double coverage) {
        this.coverage = coverage;
    }

    // Method to calculate the amount of paint needed for a given shape
    public double getAmount(Shape shape) {
        return shape.getArea() / coverage;
    }
}
