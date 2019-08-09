package com.designpatterns.creational.builder.secondapproach.builder;

import com.designpatterns.creational.builder.secondapproach.entity.Car;

public interface CarBuilder {
    void buildBodyStyle();

    void buildPower();

    void buildEngine();

    void buildBreaks();

    void buildSeats();

    void buildWindows();

    void buildFuelType();

    Car getCar();
}
