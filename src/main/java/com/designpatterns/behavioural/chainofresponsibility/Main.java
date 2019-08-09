package com.designpatterns.behavioural.chainofresponsibility;

import com.designpatterns.behavioural.chainofresponsibility.file.File;
import com.designpatterns.behavioural.chainofresponsibility.handler.DocFileHandler;
import com.designpatterns.behavioural.chainofresponsibility.handler.Handler;
import com.designpatterns.behavioural.chainofresponsibility.handler.TextFileHandler;
import com.designpatterns.behavioural.chainofresponsibility.handler.factory.HandlerFactory;
import com.designpatterns.behavioural.chainofresponsibility.handler.factory.HandlerType;

public class Main {

    public static void main(String[] args) {
        Handler textHandler = HandlerFactory.getHandler(HandlerType.TXT);
        Handler docHandler = HandlerFactory.getHandler(HandlerType.DOC);

        textHandler.setHandler(docHandler);

        File file = new File("abc.txt");
        textHandler.process(file);

        file = new File("abc.docx");
        textHandler.process(file);
    }

}