package com.example.task2;

public class Truck extends Car {
    private final Integer numberOfDoors;
    private final Float trunkCapacity;
    private final Integer maxLoadCapacity;

    public Truck() {
        numberOfDoors = 2;
        trunkCapacity = 1000.0F;
        maxLoadCapacity = 36287;
    }

    public Truck(Integer numberOfDoors, Float trunkCapacity, Integer maxLoadCapacity) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public Integer getNumberOfDoors() {
       return numberOfDoors;
    }

    @Override
    public Float getTrunkCapacity() {
        return trunkCapacity;
    }


    public Integer getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

}
