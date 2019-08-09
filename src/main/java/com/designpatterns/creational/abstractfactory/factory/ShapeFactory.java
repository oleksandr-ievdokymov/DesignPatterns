package com.designpatterns.creational.abstractfactory.factory;

import com.designpatterns.creational.abstractfactory.drawer.Drawer;
import com.designpatterns.creational.abstractfactory.figure.Shape;

public interface ShapeFactory {
    Shape getShape();
    Drawer getDrawer();
}
