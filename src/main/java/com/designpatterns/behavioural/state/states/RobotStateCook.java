package com.designpatterns.behavioural.state.states;

import com.designpatterns.behavioural.state.robot.Robot;

public class RobotStateCook implements RobotState {

    private Robot robot;

    public RobotStateCook(Robot robot) {
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
        System.out.println("Cannot clean from cook state.");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
        this.robot.setCurrentState(robot.getRobotStateOff());
        System.out.println("Robot is turned off.");
    }
}
