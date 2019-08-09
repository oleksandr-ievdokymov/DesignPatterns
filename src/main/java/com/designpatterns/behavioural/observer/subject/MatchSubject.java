package com.designpatterns.behavioural.observer.subject;

import com.designpatterns.behavioural.observer.observer.Observer;

public interface MatchSubject {

    void notifyObservers(String eventDescription);

    void addObserver(Observer user, String userInfo);

    void removeObserver(Observer user, String userInfo);

    void setEvent(String eventDescription);

    String getMatchDescription();
}
