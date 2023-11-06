package com.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

//this is for iphone
public class IphoneNotifier implements Notifier {
    private List<Observer> observers = new ArrayList<>();
    boolean isAvailable = false;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void update() {
        for (Observer x : observers) {
            x.update();
        }
    }

    @Override
    public void set(boolean state) {
        isAvailable = state;
        if (isAvailable) {
            update();
        }
    }

    @Override
    public boolean get() {
        return isAvailable;
    }
}
