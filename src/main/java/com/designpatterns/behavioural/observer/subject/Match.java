package com.designpatterns.behavioural.observer.subject;

import com.designpatterns.behavioural.observer.observer.Observer;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Match implements MatchSubject {

    private List<Observer> observers = new ArrayList<>();

    private String matchDescription;

    public Match(String matchDescription) {
        this.matchDescription = matchDescription;
    }

    public void addObserver(Observer user, String userInfo) {
        if (user == null) {
            throw new NullPointerException();
        }
        if (!this.observers.contains(user)) {
            observers.add(user);
            System.out.println("User " + userInfo + " subscribed on match " + this.getMatchDescription());
        } else {
            System.out.println("User " + userInfo + " is already subscribed on current match");
        }
    }

    public void setEvent(String eventDescription) {
        notifyObservers(eventDescription);
    }

    @Override
    public void removeObserver(Observer user, String userInfo) {
        observers.remove(user);
        System.out.println("User " + userInfo + " unsubscribed from match " + this.getMatchDescription());
    }

    public void notifyObservers(String eventDescription) {
        for (Observer user : observers) {
            user.update(eventDescription);
        }
    }
}
