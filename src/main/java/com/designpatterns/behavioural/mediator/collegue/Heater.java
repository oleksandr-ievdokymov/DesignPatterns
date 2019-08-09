package com.designpatterns.behavioural.mediator.collegue;

import com.designpatterns.behavioural.mediator.MachineMediator;

public class Heater implements Colleague {

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void onHeater(int temp) {
        System.out.println("Heater is on...");
        if (mediator.checkTemperature(temp)) {
            System.out.println("Temperature is set to " + temp);
            mediator.off();
        }
    }

    public void offHeater() {
        System.out.println("Heater is off...");
        mediator.wash();
    }
}
