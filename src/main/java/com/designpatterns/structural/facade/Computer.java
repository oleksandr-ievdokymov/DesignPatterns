package com.designpatterns.structural.facade;

public class Computer {

    public void getElectric() {
        System.out.println("Getting electricity");
    }

    public void loadSystem() {
        System.out.println("Loading system");
    }

    public void loadData() {
        System.out.println("Loading Data");
    }

    public void shutdownServices() {
        System.out.println("Shutdown services");
    }

    public void shutdownSystem() {
        System.out.println("Shutdown system");
    }
}
