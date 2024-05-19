package com.example.task2;

public abstract class Car implements Vehicle {
    public abstract Integer getNumberOfDoors();
    public abstract Float getTrunkCapacity();
    private String fuelType = "Diesel";

    @Override
    public String start() {
        return "Car is running";
    }

    @Override
    public String  stop() {
        return "Car stopped";

    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}
