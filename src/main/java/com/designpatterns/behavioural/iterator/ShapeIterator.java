package com.designpatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape> {

    private Shape[] shapes;
    private int position;

    public ShapeIterator(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public boolean hasNext() {
        if (position >= shapes.length || shapes[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Shape next() {
        return shapes[position++];
    }

    @Override
    public void remove() {
        shapes[position] = null;
        ShapeStorage.reset();
    }
}
