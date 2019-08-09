package com.designpatterns.creational.factorymethod.manager;

import com.designpatterns.creational.factorymethod.interview.iface.Interviewer;
import com.designpatterns.creational.factorymethod.interview.impl.Developer;

public class DevelopmentManager extends HiringManager {

    public Interviewer getInterviewer() {
        return new Developer();
    }
}
