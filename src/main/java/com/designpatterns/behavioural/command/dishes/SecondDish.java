package com.designpatterns.behavioural.command.dishes;

import com.designpatterns.behavioural.command.receiver.Cook;

public class SecondDish implements Command {

    private Cook cook;

    public SecondDish(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.prepareSecond();
    }

    @Override
    public String getDescription() {
        return "Second dish";
    }
}
