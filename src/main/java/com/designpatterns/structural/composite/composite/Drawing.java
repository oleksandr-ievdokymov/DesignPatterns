package com.designpatterns.structural.composite.composite;

import com.designpatterns.structural.composite.basecomponent.Shape;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    public void draw(String color) {
        for (Shape shape : shapes) {
            shape.draw(color);
        }
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    public void removeAll() {
        shapes.clear();
    }
}
