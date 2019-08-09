package com.designpatterns.structural.facade;

public class ComputerFacade {

    private Computer computer;

    public ComputerFacade(Computer computer) {
        this.computer = computer;
    }

    public void startComputer() {
        computer.getElectric();
        computer.loadSystem();
        computer.loadData();
    }

    public void shutdownComputer() {
        computer.shutdownServices();
        computer.shutdownSystem();
    }
}
