package com.designpatterns.structural.decorator.decorator;

import com.designpatterns.structural.decorator.component.Coffee;

public class Milk extends CoffeeDecorator {

    private Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }

    @Override
    public Double getPrice() {
        return coffee.getPrice() + 6.50;
    }
}
