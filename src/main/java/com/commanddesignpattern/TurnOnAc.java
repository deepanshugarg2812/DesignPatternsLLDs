package com.commanddesignpattern;

public class TurnOnAc implements ICommand{
    private AirConditioner airConditioner;

    public TurnOnAc(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}
