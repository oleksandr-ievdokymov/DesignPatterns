package com.designpatterns.creational.builder.firstapproach;

public class Main {

    public static void main(String[] args) {
        Burger burger = new BurgerBuilder(14)
                .build();
        System.out.println(burger);
    }
}