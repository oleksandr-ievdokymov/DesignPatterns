package com.designpatterns.creational.abstractfactory.drawer.impl;

import com.designpatterns.creational.abstractfactory.drawer.Drawer;
import com.designpatterns.creational.abstractfactory.figure.Shape;
import com.designpatterns.creational.abstractfactory.figure.impl.Circle;

public class CircleDrawer implements Drawer {

    public void getDescription() {
        System.out.println("I'm circle drawer");
    }

    public void draw(){
        Shape shape = new Circle();
        System.out.println("Drawing....");
        shape.getDescription();
    }
}
