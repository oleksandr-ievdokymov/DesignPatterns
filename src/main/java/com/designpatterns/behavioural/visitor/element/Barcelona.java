package com.designpatterns.behavioural.visitor.element;

import com.designpatterns.behavioural.visitor.visitor.Action;

public class Barcelona implements City {

    public void watchAttractions() {
        System.out.println("Walking in Barcelona");
    }

    @Override
    public void accept(Action action) {
        action.visitBarcelona(this);
    }
}
