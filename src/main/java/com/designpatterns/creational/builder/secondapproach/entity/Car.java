package com.designpatterns.creational.builder.secondapproach.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Car {

    private String bodyStyle;

    private String power;

    private String engine;

    private String breaks;

    private String seats;

    private String windows;

    private String fuelType;

    private String carType;

    public Car (String carType) {
        this.carType = carType;
    }
}
