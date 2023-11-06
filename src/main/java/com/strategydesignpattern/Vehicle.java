package com.strategydesignpattern;

public class Vehicle {
    private Drive drive;

    public Vehicle(Drive drive) {
        this.drive = drive;
    }

    public void drive() {
        drive.drive();
    }
}
