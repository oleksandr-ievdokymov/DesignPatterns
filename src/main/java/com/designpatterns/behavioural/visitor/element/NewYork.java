package com.designpatterns.behavioural.visitor.element;

import com.designpatterns.behavioural.visitor.visitor.Action;

public class NewYork implements City {

    public void watchAttractions() {
        System.out.println("Walking in New York");
    }

    @Override
    public void accept(Action action) {
        action.visitNewYork(this);
    }
}
