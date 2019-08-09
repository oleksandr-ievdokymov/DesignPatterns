package com.designpatterns.behavioural.mediator.collegue;

import com.designpatterns.behavioural.mediator.MachineMediator;

public class Button implements Colleague {

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void pressButton() {
        System.out.println("Button is pressed");
        mediator.start();
    }
}
