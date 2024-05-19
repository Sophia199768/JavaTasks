package com.example.task2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Task2ApplicationTests {

    @Test
    void basicGetSedanDoors() {
        Sedan newSedan = new Sedan();
        Integer doors = newSedan.getNumberOfDoors();

        assertEquals(4, doors);
    }

    @Test
    void basicSedanGetLuxuryLevel() {
        Sedan newSedan = new Sedan();
        assertEquals(2, newSedan.getLuxuryLevel());
    }


    @Test
    void truckMaxLoadCapacity() {
        Integer maxLoadCapacity = 7000;
        Integer numberOfDoors = 4;
        Float trunkCapacity = 10000.5F;
        Truck newTruck = new Truck(numberOfDoors, trunkCapacity, maxLoadCapacity);

        assertEquals(newTruck.getMaxLoadCapacity(), maxLoadCapacity);
    }


    @Test
    void startTransport() {
        Sedan newSedan = new Sedan();
        assertEquals(newSedan.start(), "Car is running");
    }


    @Test
    void getFuelType() {
        Sedan newSedan = new Sedan();
        assertEquals(newSedan.getFuelType(), "Diesel");
    }
}
