package com.designpatterns.behavioural.visitor.visitor;

import com.designpatterns.behavioural.visitor.element.Barcelona;
import com.designpatterns.behavioural.visitor.element.NewYork;

public interface Action {

    void visitBarcelona(Barcelona barcelona);

    void visitNewYork(NewYork newYork);
}
