package org.example.factoryMethod;

import org.example.factoryMethod.entity.Circle;
import org.example.factoryMethod.entity.Rectangle;
import org.example.factoryMethod.entity.Shape;
import org.example.factoryMethod.entity.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
