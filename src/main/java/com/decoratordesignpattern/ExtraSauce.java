package com.decoratordesignpattern;

public class ExtraSauce extends BasePizza{
    private BasePizza basePizza;

    public ExtraSauce(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
