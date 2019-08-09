package com.designpatterns.creational.prototype.cpconstructor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String country;
    private String city;
    private String street;

    public Address (Address that) {
        this(that.getCountry(), that.getCity(), that.getStreet());
    }
}
