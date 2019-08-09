package com.designpatterns.behavioural.state.states;

import com.designpatterns.behavioural.state.robot.Robot;

public class RobotStateOff implements RobotState {

    private Robot robot;

    public RobotStateOff(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void on() {
        this.robot.setCurrentState(robot.getRobotStateOn());
        System.out.println("Robot is turned on.");
    }

    @Override
    public void walk() {
        System.out.println("Cannot walk in off state. Need to turn on.");
    }

    @Override
    public void clean() {
        System.out.println("Cannot clean in off state. Need to turn on.");
    }

    @Override
    public void cook() {
        System.out.println("Cannot cook in off state. Need to turn on.");
    }

    @Override
    public void off() {
        System.out.println("Already in off state.");
    }
}
