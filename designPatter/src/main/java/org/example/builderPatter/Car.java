package org.example.builderPatter;

public class Car {

    private String engine;
    private String wheel;
    private String window;
    private String handle;
    private String chair;

    private boolean isHeatedSeat;
    private boolean isCoolingSeat;

    private Car(CarBuilder carBuilder) {
        this.engine = carBuilder.engine;
        this.wheel = carBuilder.wheel;
        this.window = carBuilder.window;
        this.handle = carBuilder.handle;
        this.chair = carBuilder.chair;
        this.isHeatedSeat = carBuilder.isHeatedSeat;
        this.isCoolingSeat = carBuilder.isCoolingSeat;
    }

    @Override
    public String toString() {
        return "engine : " + this.engine;
    }

    public static class CarBuilder {
        private String engine;
        private String wheel;
        private String window;
        private String handle;
        private String chair;

        private boolean isHeatedSeat;
        private boolean isCoolingSeat;

        public CarBuilder() {
        }

        public CarBuilder setHeatedSeat(boolean isHeatedSeat) {
            this.isHeatedSeat = isHeatedSeat;
            return this;
        }

        public CarBuilder setCoolingSeat(boolean isCoolingSeat) {
            this.isCoolingSeat = isCoolingSeat;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheel(String wheel) {
            this.wheel = wheel;
            return this;
        }

        public CarBuilder setWindow(String window) {
            this.window = window;
            return this;
        }

        public CarBuilder setHandle(String handle) {
            this.handle = handle;
            return this;
        }

        public CarBuilder setChair(String chair) {
            this.chair = chair;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
