package com.designpatterns.creational.abstractfactory.figure.impl;

import com.designpatterns.creational.abstractfactory.figure.Shape;

public class Square implements Shape {

    public void getDescription() {
        System.out.println("I'm square");
    }
}
