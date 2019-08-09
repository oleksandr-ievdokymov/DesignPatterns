package com.designpatterns.structural.bridge.page.impl;

import com.designpatterns.structural.bridge.page.Page;
import com.designpatterns.structural.bridge.theme.Theme;

public class AboutPage implements Page {

    private Theme theme;

    public void construct(Theme theme) {
        this.theme = theme;
    }

    public String getContent() {
        return "About page in " + theme.getType();
    }
}
