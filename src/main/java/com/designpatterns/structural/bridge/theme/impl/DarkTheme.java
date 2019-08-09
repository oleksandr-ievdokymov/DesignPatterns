package com.designpatterns.structural.bridge.theme.impl;

import com.designpatterns.structural.bridge.theme.Theme;

public class DarkTheme implements Theme {
    public String getType() {
        return "Dark Theme";
    }
}
