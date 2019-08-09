package com.designpatterns.behavioural.command;

import com.designpatterns.behavioural.command.dishes.Command;
import com.designpatterns.behavioural.command.dishes.FirstDish;
import com.designpatterns.behavioural.command.dishes.SecondDish;
import com.designpatterns.behavioural.command.invoker.Waiter;
import com.designpatterns.behavioural.command.receiver.Cook;

public class Main {

    public static void main(String[] args) {
        Cook cook = new Cook();

        Command firstDish = new FirstDish(cook);
        Command secondDish = new SecondDish(cook);

        Waiter waiter = new Waiter();
        waiter.takeOrder(firstDish);
        waiter.takeOrder(secondDish);
    }
}
