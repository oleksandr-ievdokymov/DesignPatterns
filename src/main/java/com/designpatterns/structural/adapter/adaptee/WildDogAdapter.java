package com.designpatterns.structural.adapter.adaptee;

import com.designpatterns.structural.adapter.adapter.Lion;

public class WildDogAdapter implements Lion {

    private WildDog wildDog;

    public WildDogAdapter(WildDog wildDog) {
        this.wildDog = wildDog;
    }

    public void roar() {
        this.wildDog.bark();
    }
}
