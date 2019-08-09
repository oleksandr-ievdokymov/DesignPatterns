package com.designpatterns.behavioural.mediator;

import com.designpatterns.behavioural.mediator.collegue.Heater;
import com.designpatterns.behavioural.mediator.collegue.Machine;
import com.designpatterns.behavioural.mediator.collegue.Valve;

public class CottonMediator implements MachineMediator {

    private Machine machine;
    private Valve valve;
    private Heater heater;

    public CottonMediator(Machine machine, Valve valve, Heater heater) {
        this.machine = machine;
        this.valve = valve;
        this.heater = heater;
    }

    @Override
    public void start() {
        machine.startMachine();
    }

    @Override
    public void wash() {
        System.out.println("Start washing");
    }

    @Override
    public void open() {
        valve.openValve();
    }

    @Override
    public void closed() {
        valve.closeValve();
    }

    @Override
    public void on() {
        heater.onHeater(40);
    }

    @Override
    public void off() {
        heater.offHeater();
    }

    @Override
    public boolean checkTemperature(int temp) {
        System.out.println("Temperature reached " + temp + " *C");
        return true;
    }
}
