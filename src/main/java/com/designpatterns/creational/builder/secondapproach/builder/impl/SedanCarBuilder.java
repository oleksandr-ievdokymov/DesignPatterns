package com.designpatterns.creational.builder.secondapproach.builder.impl;

import com.designpatterns.creational.builder.secondapproach.entity.Car;
import com.designpatterns.creational.builder.secondapproach.builder.CarBuilder;

public class SedanCarBuilder implements CarBuilder {

    private Car car;

    public SedanCarBuilder() {
        this.car = new Car("SEDAN");
    }

    public void buildBodyStyle() {
        car.setBodyStyle("Sedan body style");
    }

    public void buildPower() {
        car.setPower("Sedan power");
    }

    public void buildEngine() {
        car.setEngine("Sedan Engine");
    }

    public void buildBreaks() {
        car.setBreaks("Sedan breaks");
    }

    public void buildSeats() {
        car.setSeats("Sedan seats");
    }

    public void buildWindows() {
        car.setWindows("Sedan windows");
    }

    public void buildFuelType() {
        car.setFuelType("Sedan fuel type");
    }

    public Car getCar() {
        return car;
    }
}
