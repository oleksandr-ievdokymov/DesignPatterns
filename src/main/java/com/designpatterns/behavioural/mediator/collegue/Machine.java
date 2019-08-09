package com.designpatterns.behavioural.mediator.collegue;

import com.designpatterns.behavioural.mediator.MachineMediator;

public class Machine implements Colleague {

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void startMachine() {
        mediator.open();
    }
}
