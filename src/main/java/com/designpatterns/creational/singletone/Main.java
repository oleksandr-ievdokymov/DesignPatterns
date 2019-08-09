package com.designpatterns.creational.singletone;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        if (singleton.equals(singleton1)) {
            System.out.println("The same");
        }
    }
}
