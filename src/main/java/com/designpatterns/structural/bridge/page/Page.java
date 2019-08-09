package com.designpatterns.structural.bridge.page;

import com.designpatterns.structural.bridge.theme.Theme;

public interface Page {

    void construct(Theme theme);
    String getContent();
}
