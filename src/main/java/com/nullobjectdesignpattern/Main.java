package com.nullobjectdesignpattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("ab");
        System.out.println(vehicle.getTyres());
    }
}
