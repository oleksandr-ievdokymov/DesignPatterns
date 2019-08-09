package com.designpatterns.behavioural.iterator;

import lombok.Data;
import lombok.Getter;

@Data
public class ShapeStorage {

    private Shape[] shapes;

    private static int index;

    public ShapeStorage(int size) {
        this.shapes = new Shape[size];
    }

    public void addShape(String name) {
        int i = index++;
        if (!isStorageFull(i)) {
            shapes[i] = new Shape(i, name);
        } else {
            System.out.println("Shape storage is full!");
        }
    }

    private boolean isStorageFull(int i) {
        return  i >= shapes.length;
    }

    public static void reset() {
        index--;
    }
}