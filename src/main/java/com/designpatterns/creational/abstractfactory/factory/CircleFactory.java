package com.designpatterns.creational.abstractfactory.factory;

import com.designpatterns.creational.abstractfactory.drawer.Drawer;
import com.designpatterns.creational.abstractfactory.drawer.impl.CircleDrawer;
import com.designpatterns.creational.abstractfactory.figure.Shape;
import com.designpatterns.creational.abstractfactory.figure.impl.Circle;

public class CircleFactory implements ShapeFactory {

    public Shape getShape() {
        return new Circle();
    }

    public Drawer getDrawer() {
        return new CircleDrawer();
    }
}
