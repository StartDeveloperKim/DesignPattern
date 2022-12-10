package org.example.builder;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setChair("black")
                .setEngine("V1")
                .setHandle("FullOption")
                .setWheel("15")
                .setWindow("good")
                .setCoolingSeat(false)
                .setHeatedSeat(true)
                .build();

        System.out.println("car.toString() = " + car.toString());
    }
}
