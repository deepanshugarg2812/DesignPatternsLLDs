package com.flyweightdesignpattern;

import java.util.HashMap;

public class RobotFactory {
    private static HashMap<String, Robot> map = new HashMap<>();
    public static Robot getRobot(String type) {
        if (map.containsKey(type)) {
            return map.get(type);
        } else {
            System.out.println("Created");
            map.put(type, new ManualRobot(type));
            return map.get(type);
        }
    }
}
