package com.designpatterns.creational.prototype;

import com.designpatterns.creational.prototype.clone.Address;
import com.designpatterns.creational.prototype.clone.User;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("England", "London", "Downing St 10");
        User pm = new User("Prime", "Minister", address);
        User deepCopy = (User) pm.clone();
    }
}
