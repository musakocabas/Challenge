package com.mek03;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String startEngine(){return getClass().getName() + " --> startEngine()";}
    public String accelerate(){return getClass().getName() + " --> accelerate()";}
    public String brake(){return getClass().getName() + " --> brake()";}
}
