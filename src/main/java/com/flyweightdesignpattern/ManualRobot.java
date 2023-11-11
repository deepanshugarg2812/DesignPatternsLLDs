package com.flyweightdesignpattern;

public class ManualRobot implements Robot{
    private String type;

    public ManualRobot(String type) {
        this.type = type;
    }

    @Override
    public void display(int x, int y) {
        System.out.println(type + "," + x + "," + y);
    }
}
