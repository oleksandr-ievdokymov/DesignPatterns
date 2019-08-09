package com.designpatterns.behavioural.strategy;

import com.designpatterns.behavioural.strategy.context.Phone;
import com.designpatterns.behavioural.strategy.strategy.FacebookApp;
import com.designpatterns.behavioural.strategy.strategy.InstagramApp;
import com.designpatterns.behavioural.strategy.strategy.TwitterApp;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone(new TwitterApp());
        phone.runApp();

        phone = new Phone(new InstagramApp());
        phone.runApp();

        phone = new Phone(new FacebookApp());
        phone.runApp();
    }
}
