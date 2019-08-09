package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.iface.Shape;
import com.designpatterns.creational.factory.type.ShapeType;

public class Main {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);

        circle.draw();
        square.draw();
    }
}
