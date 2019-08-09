package com.designpatterns.creational.builder.firstapproach;

public class Burger {

    private int size;

    private boolean cheese;
    private boolean pepperoni;
    private boolean lettuce;
    private boolean tomato;

    public Burger(BurgerBuilder burgerBuilder) {
        this.size = burgerBuilder.getSize();
        this.cheese = burgerBuilder.isCheese();
        this.pepperoni = burgerBuilder.isPepperoni();
        this.lettuce = burgerBuilder.isLettuce();
        this.tomato = burgerBuilder.isTomato();
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                '}';
    }
}
