package com.strategydesignpattern;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDrive());
    }
}
