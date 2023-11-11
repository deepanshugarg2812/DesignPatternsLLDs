package com.flyweightdesignpattern;

public class Main {
    public static void main(String[] args) {
        Robot robot = RobotFactory.getRobot("manual");
        robot.display(10,20);

        robot = RobotFactory.getRobot("human");
        robot.display(20,30);

        robot = RobotFactory.getRobot("manual");
        robot.display(20,30);
    }
}
