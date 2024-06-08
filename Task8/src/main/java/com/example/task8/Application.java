package com.example.task8;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Application {
    private static final int SIMULATION_TIME = 2;
    private static final Random random = new Random();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < SIMULATION_TIME * 60; i++) {
            int buyersCount = random.nextInt(3);
            for (int j = 0; j < buyersCount; j++) {
                executorService.execute(new Buyer());
            }
            try {
                    Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(5, TimeUnit.MINUTES)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
