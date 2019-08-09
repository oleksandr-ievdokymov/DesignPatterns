package com.designpatterns.structural.decorator.component;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public Double getPrice() {
        return 50.0;
    }
}
