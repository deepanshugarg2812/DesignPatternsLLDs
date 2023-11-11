package com.commanddesignpattern;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new TurnOffAc(airConditioner));
        remoteControl.pressButton();
    }
}
