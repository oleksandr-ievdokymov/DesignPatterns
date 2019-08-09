package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.manager.DevelopmentManager;
import com.designpatterns.creational.factorymethod.manager.HiringManager;
import com.designpatterns.creational.factorymethod.manager.QAManager;

public class Main {

    public static void main(String[] args) {
        HiringManager developmentManager = new DevelopmentManager();
        developmentManager.takeInterview();

        HiringManager hiringManager = new QAManager();
        hiringManager.takeInterview();
    }
}
