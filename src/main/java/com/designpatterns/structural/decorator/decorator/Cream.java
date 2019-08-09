package com.designpatterns.structural.decorator.decorator;

import com.designpatterns.structural.decorator.component.Coffee;

public class Cream extends CoffeeDecorator {

    private Coffee coffee;

    public Cream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", cream";
    }

    @Override
    public Double getPrice() {
        return coffee.getPrice() + 10.0;
    }
}
