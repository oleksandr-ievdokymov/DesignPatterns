package com.designpatterns.behavioural.memento;

public class Main {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(careTaker);
        System.out.println("Initial state " + originator);

        System.out.println("-------------------------------");

        originator.setX(originator.getX() + 5);
        originator.saveCurrentState("Save1");
        System.out.println("Current state " + originator);

        System.out.println("-------------------------------");

        originator.setY(originator.getY() + 10);
        System.out.println("Current state " + originator);
        originator.undo();
        System.out.println("Current state " + originator);

        System.out.println("-------------------------------");

        originator.setY(originator.getY() + 100);
        originator.saveCurrentState("Save2");
        System.out.println("Current state " + originator);

        System.out.println("-------------------------------");

        originator.setX(Math.pow(originator.getX(), 3));
        originator.saveCurrentState("Save3");
        System.out.println("Current state " + originator);

        System.out.println("-------------------------------");

        originator.setY(Math.abs(originator.getY() - 600));
        originator.saveCurrentState("Save4");
        System.out.println("Current state " + originator);

        System.out.println("-------------------------------");

        originator.undo("Save2");
        System.out.println("Current state " + originator);

        System.out.println("-------------------------------");

        originator.undoAll();
        System.out.println("Current state " + originator);
    }
}
