package com.adapterdesignpattern;

public class Main {
    public static void main(String[] args) {
        WeightingAdapter weightingAdapter = new WeightingAdapterImpl(new WeightInPound());
        System.out.println(weightingAdapter.getWeightInKg());
    }
}
