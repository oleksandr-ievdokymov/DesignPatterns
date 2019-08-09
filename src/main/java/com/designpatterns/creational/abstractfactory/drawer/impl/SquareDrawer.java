package com.designpatterns.creational.abstractfactory.drawer.impl;

import com.designpatterns.creational.abstractfactory.drawer.Drawer;

public class SquareDrawer implements Drawer {

    public void getDescription() {
        System.out.println("I'm square drawer");
    }
}
