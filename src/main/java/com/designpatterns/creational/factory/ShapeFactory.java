package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.iface.Shape;
import com.designpatterns.creational.factory.impl.Circle;
import com.designpatterns.creational.factory.impl.Square;
import com.designpatterns.creational.factory.type.ShapeType;

public class ShapeFactory {

    public static Shape getShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            default:
                throw new IllegalArgumentException("Wrong shape type: " + type);
        }
    }
}
