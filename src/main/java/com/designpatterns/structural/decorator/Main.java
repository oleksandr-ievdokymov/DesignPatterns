package com.designpatterns.structural.decorator;

import com.designpatterns.structural.decorator.component.Coffee;
import com.designpatterns.structural.decorator.component.SimpleCoffee;
import com.designpatterns.structural.decorator.decorator.Cream;
import com.designpatterns.structural.decorator.decorator.Milk;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();

        coffee = new Milk(coffee);
        coffee = new Cream(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());
    }
}
