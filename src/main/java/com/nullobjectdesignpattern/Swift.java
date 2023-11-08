package com.nullobjectdesignpattern;

import javafx.util.Pair;

public class Swift implements Vehicle{
    @Override
    public Pair<Integer, Integer> getTyres() {
        return new Pair<>(4,4);
    }
}
