package com.designpatterns.creational.builder.secondapproach;

import com.designpatterns.creational.builder.secondapproach.builder.CarBuilder;
import com.designpatterns.creational.builder.secondapproach.builder.impl.SedanCarBuilder;
import com.designpatterns.creational.builder.secondapproach.builder.impl.SportsCarBuilder;
import com.designpatterns.creational.builder.secondapproach.director.CarDirector;
import com.designpatterns.creational.builder.secondapproach.entity.Car;

public class Main {

    public static void main(String[] args) {
        CarBuilder carBuilder = new SedanCarBuilder();
        CarDirector carDirector = new CarDirector(carBuilder);
        carDirector.construct();
        Car car = carBuilder.getCar();
        System.out.println(car);

        carBuilder = new SportsCarBuilder();
        carDirector = new CarDirector(carBuilder);
        carDirector.construct();
        car = carBuilder.getCar();
        System.out.println(car);
    }
}