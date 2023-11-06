package com.observerdesignpattern;

//this is observable class means this is being observed
public interface Notifier {
    void add(Observer observer);
    void remove(Observer observer);
    void update();
    void set(boolean state);
    boolean get();
}
