package com.designpatterns.behavioural.command.dishes;

import com.designpatterns.behavioural.command.receiver.Cook;

public class FirstDish implements Command {

    private Cook cook;

    public FirstDish(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.prepareFirst();
    }

    @Override
    public String getDescription() {
        return "First dish";
    }
}
