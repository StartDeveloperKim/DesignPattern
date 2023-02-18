package org.example.builder;

import java.lang.ref.WeakReference;

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

        Person person = new Person.Builder()
                .name("김진수")
                .weight(70L)
                .build();

        User instance1 = User.INSTANCE;
        User instance2 = User.INSTANCE;

        System.out.println("instance1 = " + instance1.hashCode());
        System.out.println("instance2 = " + instance2.hashCode());


    }
}
