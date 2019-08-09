package com.designpatterns.behavioural.memento;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = {"lastSaveStateName", "careTaker"})
public class Originator {

    private double x;

    private double y;

    private String lastSaveStateName;

    private CareTaker careTaker;

    public Originator(CareTaker careTaker) {
        this.careTaker = careTaker;
        saveCurrentState("Initial");
    }

    public void saveCurrentState(String saveStateName) {
        this.lastSaveStateName = saveStateName;
        careTaker.saveMemento(saveStateName, new Memento(this.x, this.y));
    }

    public void undo() {
        getMemento(lastSaveStateName);
    }

    public void undo(String saveStateName) {
        getMemento(saveStateName);
    }

    public void undoAll() {
        getMemento("Initial");
        careTaker.clearSaveMementoStorage();
    }

    private void getMemento(String saveStateName) {
        Memento memento = careTaker.getMemento(saveStateName);
        this.x = memento.getX();
        this.y = memento.getY();
    }

}
