package com.designpatterns.behavioural.visitor.element;

import com.designpatterns.behavioural.visitor.visitor.Action;

public interface City {

    void accept(Action action);
}
