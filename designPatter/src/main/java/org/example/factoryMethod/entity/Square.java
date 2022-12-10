package org.example.factoryMethod.entity;

import org.example.factoryMethod.entity.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}
