package com.designpatterns.creational.abstractfactory.factory;

import com.designpatterns.creational.abstractfactory.drawer.Drawer;
import com.designpatterns.creational.abstractfactory.drawer.impl.SquareDrawer;
import com.designpatterns.creational.abstractfactory.figure.Shape;
import com.designpatterns.creational.abstractfactory.figure.impl.Square;

public class SquareFactory implements ShapeFactory {

    public Shape getShape() {
        return new Square();
    }

    public Drawer getDrawer() {
        return new SquareDrawer();
    }
}
