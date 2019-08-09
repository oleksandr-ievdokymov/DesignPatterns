package com.designpatterns.structural.bridge;

import com.designpatterns.structural.bridge.page.Page;
import com.designpatterns.structural.bridge.page.impl.AboutPage;
import com.designpatterns.structural.bridge.page.impl.MainPage;
import com.designpatterns.structural.bridge.theme.Theme;
import com.designpatterns.structural.bridge.theme.impl.DarkTheme;
import com.designpatterns.structural.bridge.theme.impl.LightTheme;

public class Main {

    public static void main(String[] args) {
        Theme lightTheme = new LightTheme();
        Theme darkTheme = new DarkTheme();

        Page mainPage = new MainPage();
        mainPage.construct(lightTheme);
        System.out.println(mainPage.getContent());

        Page aboutPage = new AboutPage();
        aboutPage.construct(darkTheme);
        System.out.println(aboutPage.getContent());
    }
}
