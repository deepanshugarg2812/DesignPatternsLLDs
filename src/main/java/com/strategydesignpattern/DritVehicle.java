package com.strategydesignpattern;

public class DritVehicle extends Vehicle{
    public DritVehicle() {
        super(new SportsDrive());
    }
}
