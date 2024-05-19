package com.example.task3;

public class Computer {

    public static class Processor {
        private final String model;

        public Processor(String model) {
            this.model = model;
        }

        public String getDetails() {
            return model;
        }
    }

    public class RAM {
        private final Integer size;

        public RAM(Integer size) {
            this.size = size;
        }

        public String getDetails() {
            return String.valueOf(size);
        }
    }
}
