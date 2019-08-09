package com.designpatterns.creational.factorymethod.manager;

import com.designpatterns.creational.factorymethod.interview.iface.Interviewer;

public abstract class HiringManager {

    public abstract Interviewer getInterviewer();

    public void takeInterview() {
        Interviewer interviewer = getInterviewer();
        interviewer.askQuestion();
    }
}
