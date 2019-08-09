package com.designpatterns.behavioural.state;

import com.designpatterns.behavioural.state.robot.Robot;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.on();
        robot.walk();
        robot.clean();
        robot.walk();
        robot.cook();
        robot.off();

        robot.cook();
        robot.on();
        robot.cook();
        robot.clean();
        robot.on();
        robot.off();
    }
}
