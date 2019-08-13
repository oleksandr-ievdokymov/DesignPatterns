package com.designpatterns.behavioural.visitor.visitor;

import com.designpatterns.behavioural.visitor.element.Barcelona;
import com.designpatterns.behavioural.visitor.element.NewYork;

import java.io.Serializable;

public class Tour implements Action, Serializable {

    @Override
    public void visitBarcelona(Barcelona barcelona) {
        barcelona.watchAttractions();
    }

    @Override
    public void visitNewYork(NewYork newYork) {
        newYork.watchAttractions();
    }
}
