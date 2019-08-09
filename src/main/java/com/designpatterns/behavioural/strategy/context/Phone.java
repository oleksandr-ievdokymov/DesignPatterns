package com.designpatterns.behavioural.strategy.context;

import com.designpatterns.behavioural.strategy.strategy.App;

public class Phone {

    private App app;

    public Phone(App app) {
        this.app = app;
    }

    public void runApp() {
        this.app.run();
    }
}
