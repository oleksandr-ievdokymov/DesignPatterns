package com.designpatterns.creational.builder.secondapproach.builder.impl;

import com.designpatterns.creational.builder.secondapproach.entity.Car;
import com.designpatterns.creational.builder.secondapproach.builder.CarBuilder;

public class SportsCarBuilder implements CarBuilder {

    private Car car;

    public SportsCarBuilder() {
        this.car = new Car("SPORTS");
    }

    public void buildBodyStyle() {
        car.setBodyStyle("Sports body style");
    }

    public void buildPower() {
        car.setPower("Sports power");
    }

    public void buildEngine() {
        car.setEngine("Sports Engine");
    }

    public void buildBreaks() {
        car.setBreaks("Sports breaks");
    }

    public void buildSeats() {
        car.setSeats("Sports seats");
    }

    public void buildWindows() {
        car.setWindows("Sports windows");
    }

    public void buildFuelType() {
        car.setFuelType("Sports fuel type");
    }

    public Car getCar() {
        return car;
    }
}
