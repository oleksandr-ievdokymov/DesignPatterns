package com.designpatterns.behavioural.chainofresponsibility.handler;

import com.designpatterns.behavioural.chainofresponsibility.file.File;

public interface Handler {

    void setHandler(Handler handler);
    void process(File file);
    String getHandlerName();
}
