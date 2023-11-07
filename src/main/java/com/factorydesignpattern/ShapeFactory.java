package com.factorydesignpattern;

public class ShapeFactory {
    public static Shape getShape(String shape) {
        switch (shape) {
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
            default:
                return null;
        }
    }
}
