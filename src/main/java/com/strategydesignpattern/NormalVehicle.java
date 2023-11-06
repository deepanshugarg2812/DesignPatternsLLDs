package com.strategydesignpattern;

public class NormalVehicle extends Vehicle{
    public NormalVehicle(Drive drive) {
        super(new NormalDrive());
    }
}
