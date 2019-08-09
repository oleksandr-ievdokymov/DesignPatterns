package com.designpatterns.structural.composite.leaf;

import com.designpatterns.structural.composite.basecomponent.Shape;

public class Circle implements Shape {

    public void draw(String color) {
        System.out.println("Drawing circle with color: " + color);
    }
}
