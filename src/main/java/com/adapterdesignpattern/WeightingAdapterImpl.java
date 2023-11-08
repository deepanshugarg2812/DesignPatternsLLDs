package com.adapterdesignpattern;

public class WeightingAdapterImpl implements WeightingAdapter{
    private WeightMachine weightMachine;

    public WeightingAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public int getWeightInKg() {
        return weightMachine.getWeightInPounds() + 20;
    }
}
