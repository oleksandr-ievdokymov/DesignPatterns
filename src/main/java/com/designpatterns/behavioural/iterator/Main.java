package com.designpatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ShapeStorage shapeStorage = new ShapeStorage(5);
        shapeStorage.addShape("A");
        shapeStorage.addShape("B");
        shapeStorage.addShape("C");
        shapeStorage.addShape("D");
        shapeStorage.addShape("E");

        ShapeIterator shapeIterator = new ShapeIterator(shapeStorage.getShapes());
        while (shapeIterator.hasNext()) {
            System.out.println(shapeIterator.next());
        }

        System.out.println("Apply removing while iterating...");
        shapeIterator = new ShapeIterator(shapeStorage.getShapes());
        while(shapeIterator.hasNext()){
            shapeIterator.remove();
            shapeIterator.next();
        }

        shapeStorage.addShape("F");

        shapeIterator = new ShapeIterator(shapeStorage.getShapes());
        while (shapeIterator.hasNext()) {
            System.out.println(shapeIterator.next());
        }
    }
}
