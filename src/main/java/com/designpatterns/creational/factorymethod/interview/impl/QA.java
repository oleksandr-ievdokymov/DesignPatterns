package com.designpatterns.creational.factorymethod.interview.impl;

import com.designpatterns.creational.factorymethod.interview.iface.Interviewer;

public class QA implements Interviewer {

    public void askQuestion() {
        System.out.println("Ask about testing frameworks");
    }
}
