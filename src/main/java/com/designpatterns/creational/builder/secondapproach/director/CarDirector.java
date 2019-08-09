package com.designpatterns.creational.builder.secondapproach.director;

import com.designpatterns.creational.builder.secondapproach.builder.CarBuilder;

public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void construct() {
        carBuilder.buildBodyStyle();
        carBuilder.buildBreaks();
        carBuilder.buildEngine();
        carBuilder.buildFuelType();
        carBuilder.buildPower();
        carBuilder.buildSeats();
        carBuilder.buildWindows();
    }
}
