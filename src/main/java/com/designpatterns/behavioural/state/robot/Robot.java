package com.designpatterns.behavioural.state.robot;

import com.designpatterns.behavioural.state.states.RobotState;
import com.designpatterns.behavioural.state.states.*;
import lombok.Data;

@Data
public class Robot {

    private RobotState robotStateOn;
    private RobotState robotStateWalk;
    private RobotState robotStateClean;
    private RobotState robotStateCook;
    private RobotState robotStateOff;
    private RobotState currentState;

    public Robot() {
        this.robotStateOn = new RobotStateOn(this);
        this.robotStateWalk = new RobotStateWalk(this);
        this.robotStateClean = new RobotStateClean(this);
        this.robotStateCook = new RobotStateCook(this);
        this.robotStateOff = new RobotStateOff(this);
        this.currentState = robotStateOff;
        System.out.println("Robot is turned off");
    }

    public void on() {
        currentState.on();
    }

    public void walk() {
        currentState.walk();
    }

    public void clean() {
        currentState.clean();
    }

    public void cook() {
        currentState.cook();
    }

    public void off() {
        currentState.off();
    }
}
