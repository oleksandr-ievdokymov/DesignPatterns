package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.drawer.Drawer;
import com.designpatterns.creational.abstractfactory.factory.CircleFactory;
import com.designpatterns.creational.abstractfactory.factory.ShapeFactory;
import com.designpatterns.creational.abstractfactory.factory.SquareFactory;
import com.designpatterns.creational.abstractfactory.figure.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();

        Shape circle = circleFactory.getShape();
        circle.getDescription();

        Drawer circleDrawer = circleFactory.getDrawer();
        circleDrawer.getDescription();

        ShapeFactory squareFactory = new SquareFactory();

        Shape square = squareFactory.getShape();
        square.getDescription();

        Drawer squareDrawer = squareFactory.getDrawer();
        squareDrawer.getDescription();
    }
}
