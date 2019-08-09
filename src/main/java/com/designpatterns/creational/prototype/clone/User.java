package com.designpatterns.creational.prototype.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User implements Cloneable {
    private String firstName;
    private String lastName;
    private Address address;

    @Override
    public Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.setAddress((Address) this.address.clone());
        return user;
    }
}
