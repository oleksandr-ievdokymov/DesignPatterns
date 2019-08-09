package com.designpatterns.behavioural.state.states;

import com.designpatterns.behavioural.state.robot.Robot;

public class RobotStateOn implements RobotState {

    private Robot robot;

    public RobotStateOn(Robot robot) {
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
        this.robot.setCurrentState(robot.getRobotStateClean());
        System.out.println("Cleaning...");
    }

    @Override
    public void cook() {
        this.robot.setCurrentState(robot.getRobotStateCook());
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
        this.robot.setCurrentState(robot.getRobotStateOff());
        System.out.println("Robot is turned off.");
    }
}
