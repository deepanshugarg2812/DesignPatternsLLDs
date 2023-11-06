package com.observerdesignpattern;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new IphoneNotifier();
        Observer observer = new EmailObserver(notifier);
        notifier.add(observer);
        notifier.set(true);
    }
}
