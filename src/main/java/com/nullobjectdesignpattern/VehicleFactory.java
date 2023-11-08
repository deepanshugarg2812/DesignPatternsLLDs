package com.nullobjectdesignpattern;

public abstract class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        switch (type) {
            case "Swift":
                return new Swift();
            default:
                return new NullObjectVehicle();
        }
    }
}
