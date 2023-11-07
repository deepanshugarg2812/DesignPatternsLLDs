package com.abstractfactorydesignpattern;

public class OrdinaryCarFactory implements CarsFactory{
    @Override
    public Cars getCars(String name) {
        switch (name) {
            case "Swift":
                return new Swift();
            default:
                return null;
        }
    }
}
