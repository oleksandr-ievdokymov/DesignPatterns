package com.designpatterns.behavioural.observer.observer;

public interface Observer {

    void update(String eventDescription);

    void subscribe();

    void unsubscribe();
}
