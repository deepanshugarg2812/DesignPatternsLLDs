package com.abstractfactorydesignpattern;

public class Main {
    public static void main(String[] args) {
        CarsFactory carsFactory = CarTypeFactory.carsFactory("Ordinary");
        Cars cars = carsFactory.getCars("Swift");
        cars.name();
    }
}
