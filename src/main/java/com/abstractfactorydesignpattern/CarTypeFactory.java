package com.abstractfactorydesignpattern;

public class CarTypeFactory {
    public static CarsFactory carsFactory(String type) {
        switch (type) {
            case "Luxary":
                return new LuxaryCarFactory();
            case "Ordinary":
                return new OrdinaryCarFactory();
            default:
                return null;
        }
    }
}
