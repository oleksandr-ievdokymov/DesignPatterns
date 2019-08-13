package com.designpatterns.behavioural.visitor;

import com.designpatterns.behavioural.visitor.element.Barcelona;
import com.designpatterns.behavioural.visitor.element.City;
import com.designpatterns.behavioural.visitor.element.NewYork;
import com.designpatterns.behavioural.visitor.visitor.Tour;

public class Main {

    public static void main(String[] args) {
        City barcelona = new Barcelona();
        City newYork = new NewYork();

        Tour tour = new Tour();

        barcelona.accept(tour);
        newYork.accept(tour);
    }
}
