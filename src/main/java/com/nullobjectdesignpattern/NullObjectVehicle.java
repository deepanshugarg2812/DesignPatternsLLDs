package com.nullobjectdesignpattern;

import javafx.util.Pair;

public class NullObjectVehicle implements Vehicle{
    @Override
    public Pair<Integer, Integer> getTyres() {
        return new Pair<>(0,0);
    }
}
