package com.designpatterns.structural.composite;

import com.designpatterns.structural.composite.basecomponent.Shape;
import com.designpatterns.structural.composite.composite.Drawing;
import com.designpatterns.structural.composite.leaf.Circle;
import com.designpatterns.structural.composite.leaf.Rectangle;
import com.designpatterns.structural.composite.leaf.Triangle;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();

        Drawing drawing = new Drawing();
        drawing.add(circle);
        drawing.add(triangle);
        drawing.add(rectangle);

        drawing.draw("RED");

        drawing.removeAll();

        drawing.add(circle);
        drawing.add(triangle);

        drawing.draw("BLUE");
    }
}
