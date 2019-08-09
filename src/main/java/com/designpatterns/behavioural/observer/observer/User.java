package com.designpatterns.behavioural.observer.observer;

import com.designpatterns.behavioural.observer.subject.MatchSubject;
import lombok.Data;

@Data
public class User implements Observer {

    private String userName;

    private MatchSubject matchSubject;

    public User(MatchSubject matchSubject, String userName) {
        this.matchSubject = matchSubject;
        this.userName = userName;
    }

    @Override
    public void update(String eventDescription) {
        updateUser(eventDescription);
    }

    @Override
    public void subscribe() {
        this.matchSubject.addObserver(this, this.getUserName());
    }

    @Override
    public void unsubscribe() {
        this.matchSubject.removeObserver(this, this.getUserName());
    }

    private void updateUser(String eventDescription) {
        System.out.println("Sent to " + getUserName() + ": " + eventDescription);
    }
}
