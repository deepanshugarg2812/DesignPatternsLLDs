package com.observerdesignpattern;

public class MobileObserver implements Observer {
    private Notifier notifier;
    public MobileObserver(Notifier notifier) {
        this.notifier = notifier;
    }
    @Override
    public void update() {
        System.out.println("Mobile observer " + notifier.get());
    }
}
