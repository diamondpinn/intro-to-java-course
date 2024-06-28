package com.cbfacademy.cars;

public class Car {
    private String make;
    private String model;
    private int year;
    private String colour;

    public Car(String make, String model, int year, String colour) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getDetails() {
        return "Car details" + this.make + this.model + this.year + this.colour;
    }
}

