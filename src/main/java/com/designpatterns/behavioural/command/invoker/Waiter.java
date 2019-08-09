package com.designpatterns.behavioural.command.invoker;

import com.designpatterns.behavioural.command.dishes.Command;

public class Waiter {

    public void takeOrder(Command command) {
        System.out.println("Get order for " + command.getDescription());
        command.execute();
        System.out.println("Here is your " + command.getDescription());
    }
}
