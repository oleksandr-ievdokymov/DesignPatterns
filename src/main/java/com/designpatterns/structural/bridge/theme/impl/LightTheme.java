package com.designpatterns.structural.bridge.theme.impl;

import com.designpatterns.structural.bridge.theme.Theme;

public class LightTheme implements Theme {
    public String getType() {
        return "Light Theme";
    }
}
