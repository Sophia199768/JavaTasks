package com.example.task2;

public class Sedan extends Car {
    private final Integer numberOfDoors;
    private final Float trunkCapacity;
    private final Integer luxuryLevel;
    public Sedan() {
        numberOfDoors = 4;
        trunkCapacity = 14.0F;
        luxuryLevel = 2;

    }

    public Sedan(Integer numberOfDoors, Float trunkCapacity, Integer luxuryLevel) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.luxuryLevel = luxuryLevel;
    }

    @Override
    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public Float getTrunkCapacity() {
        return trunkCapacity;
    }

    public Integer getLuxuryLevel() {
        return luxuryLevel;
    }
}
