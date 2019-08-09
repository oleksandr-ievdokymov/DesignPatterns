package com.designpatterns.structural.composite.leaf;

import com.designpatterns.structural.composite.basecomponent.Shape;

public class Triangle implements Shape {

    public void draw(String color) {
        System.out.println("Drawing triangle with color: " + color);
    }
}
