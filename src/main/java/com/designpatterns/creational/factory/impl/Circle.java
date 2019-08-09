package com.designpatterns.creational.factory.impl;

import com.designpatterns.creational.factory.iface.Shape;

public class Circle implements Shape {

    public void draw() {
        System.out.println("Circle");
    }
}
