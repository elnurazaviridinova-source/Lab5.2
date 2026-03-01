package org.example.constructor;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;

    }
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }
    public void info(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

    }
}
