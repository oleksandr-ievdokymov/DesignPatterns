package com.designpatterns.creational.prototype.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address implements Cloneable{
    private String country;
    private String city;
    private String street;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
