package com.designpatterns.behavioural.observer;

import com.designpatterns.behavioural.observer.observer.Observer;
import com.designpatterns.behavioural.observer.observer.User;
import com.designpatterns.behavioural.observer.subject.Match;
import com.designpatterns.behavioural.observer.subject.MatchSubject;

public class Main {

    public static void main(String[] args) {
        MatchSubject match = new Match("Team1 - Team2");
        Observer user = new User(match, "John Doe");

        user.subscribe();

        match.setEvent("Squads are available. " + match.getMatchDescription());
        match.setEvent("Match is started. " + match.getMatchDescription());

        user.unsubscribe();
    }
}
