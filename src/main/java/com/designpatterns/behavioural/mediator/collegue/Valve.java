package com.designpatterns.behavioural.mediator.collegue;

import com.designpatterns.behavioural.mediator.MachineMediator;

public class Valve implements Colleague {

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void openValve() {
        System.out.println("Valve is opened...");
        System.out.println("Filling water...");
        mediator.closed();
    }

    public void closeValve() {
        System.out.println("Valve is closed...");
        mediator.on();
    }
}
