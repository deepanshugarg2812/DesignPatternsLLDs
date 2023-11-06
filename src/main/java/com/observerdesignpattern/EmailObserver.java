package com.observerdesignpattern;

public class EmailObserver implements Observer {
    private Notifier notifier;
    public EmailObserver(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void update() {
        System.out.println("Email notified with state " + notifier.get());
    }
}
