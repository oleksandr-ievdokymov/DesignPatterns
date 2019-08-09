package com.designpatterns.behavioural.memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private Map<String, Memento> saveMementoStorage = new HashMap<>();

    public void saveMemento(String saveMementoName, Memento memento) {
        System.out.println("Saving state with name " + saveMementoName + ". Values: " + memento.getX() + ", " + memento.getY());
        saveMementoStorage.put(saveMementoName, memento);
    }

    public Memento getMemento(String saveMementoName) {
        System.out.println("Undo at " + saveMementoName);
        return saveMementoStorage.get(saveMementoName);
    }

    public void clearSaveMementoStorage() {
        System.out.println("Clear all saving");
        saveMementoStorage.clear();
    }
}
