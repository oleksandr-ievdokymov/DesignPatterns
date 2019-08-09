package com.designpatterns.behavioural.mediator;

import com.designpatterns.behavioural.mediator.collegue.Button;
import com.designpatterns.behavioural.mediator.collegue.Heater;
import com.designpatterns.behavioural.mediator.collegue.Machine;
import com.designpatterns.behavioural.mediator.collegue.Valve;

public class Main {

    public static void main(String[] args) {
        Machine machine = new Machine();
        Heater heater = new Heater();
        Valve valve = new Valve();
        Button button = new Button();

        MachineMediator machineMediator = new CottonMediator(machine, valve, heater);

        button.setMediator(machineMediator);
        machine.setMediator(machineMediator);
        heater.setMediator(machineMediator);
        valve.setMediator(machineMediator);

        button.pressButton();
    }
}
