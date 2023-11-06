package com.decoratordesignpattern;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new ExtraSauce(new ExtraCheese(new CheesePiza()));
        System.out.println(basePizza.cost());
    }
}
