package com.designpatterns.creational.prototype.cpconstructor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private Address address;

    public User(User that) {
        this(that.getFirstName(), that.getLastName(), new Address(that.getAddress()));
    }
}
