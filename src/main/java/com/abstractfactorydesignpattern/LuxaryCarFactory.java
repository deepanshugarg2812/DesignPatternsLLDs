package com.abstractfactorydesignpattern;

public class LuxaryCarFactory implements CarsFactory{
    @Override
    public Cars getCars(String name) {
        switch (name) {
            case "Benz":
                return new Benz();
            default:
                return null;
        }
    }
}
