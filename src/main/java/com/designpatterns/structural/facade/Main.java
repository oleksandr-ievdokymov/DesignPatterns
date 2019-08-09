package com.designpatterns.structural.facade;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerFacade computerFacade = new ComputerFacade(computer);

        computerFacade.startComputer();
        computerFacade.shutdownComputer();
    }
}
