package com.designpatterns.behavioural.chainofresponsibility.handler.factory;

import com.designpatterns.behavioural.chainofresponsibility.handler.DocFileHandler;
import com.designpatterns.behavioural.chainofresponsibility.handler.Handler;
import com.designpatterns.behavioural.chainofresponsibility.handler.TextFileHandler;

public class HandlerFactory {

    public static Handler getHandler(HandlerType handlerType) {
        switch (handlerType){
            case TXT:
                return new TextFileHandler("Text Handler");
            case DOC:
                return new DocFileHandler("Doc Handler");
            default:
                throw new IllegalArgumentException("Wrong shape type: " + handlerType);
        }
    }
}
