package com.designpatterns.behavioural.state.states;

import com.designpatterns.behavioural.state.robot.Robot;

public class RobotStateClean implements RobotState {

    private Robot robot;

    public RobotStateClean(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void on() {
        System.out.println("Robot is already turned on.");
    }

    @Override
    public void walk() {
        this.robot.setCurrentState(robot.getRobotStateWalk());
        System.out.println("Walking...");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning...");
    }

    @Override
    public void cook() {
        System.out.println("Cannot cook from clean state.");
    }

    @Override
    public void off() {
        this.robot.setCurrentState(robot.getRobotStateOff());
        System.out.println("Robot is turned off.");
    }
}
