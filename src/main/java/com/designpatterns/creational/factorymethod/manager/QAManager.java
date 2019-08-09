package com.designpatterns.creational.factorymethod.manager;

import com.designpatterns.creational.factorymethod.interview.iface.Interviewer;
import com.designpatterns.creational.factorymethod.interview.impl.QA;

public class QAManager extends HiringManager {

    public Interviewer getInterviewer() {
        return new QA();
    }
}
