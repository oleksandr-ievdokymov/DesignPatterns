package com.designpatterns.structural.composite.leaf;

import com.designpatterns.structural.composite.basecomponent.Shape;

public class Rectangle implements Shape {

    public void draw(String color) {
        System.out.println("Drawing rectangle with color: " + color);
    }
}
