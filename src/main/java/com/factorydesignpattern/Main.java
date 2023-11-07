package com.factorydesignpattern;

public class Main {
    public static void main(String[] args) {
        Shape shap = ShapeFactory.getShape("Rectangle");
        shap.draw();
    }
}
