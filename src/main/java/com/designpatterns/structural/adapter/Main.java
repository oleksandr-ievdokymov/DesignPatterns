package com.designpatterns.structural.adapter;

import com.designpatterns.structural.adapter.adaptee.WildDog;
import com.designpatterns.structural.adapter.adaptee.WildDogAdapter;
import com.designpatterns.structural.adapter.adapter.Lion;

public class Main {

    public static void main(String[] args) {
        WildDog wildDog = new WildDog();
        Lion lion = new WildDogAdapter(wildDog);

        Hunter hunter = new Hunter();
        hunter.hunt(lion);
    }
}
