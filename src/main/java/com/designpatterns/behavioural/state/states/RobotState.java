package com.designpatterns.behavioural.state.states;

public interface RobotState {

    void on();

    void walk();

    void clean();

    void cook();

    void off();
}
