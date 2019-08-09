package com.designpatterns.behavioural.chainofresponsibility.handler;

import com.designpatterns.behavioural.chainofresponsibility.file.File;

public class TextFileHandler implements Handler {

    private Handler handler;

    private String handlerName;

    public TextFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        String fileType = file.getFileName().split("\\.")[1];
        System.out.println(getHandlerName() + " trying to process " + file.getFileName());
        if(fileType.equals("txt")) {
            System.out.println("Processing and saving " + fileType + " file by " + getHandlerName());
        } else if(handler != null) {
            System.out.println(getHandlerName() + " forwards request to  " + handler.getHandlerName());
            handler.process(file);
        } else {
            System.out.println("File is not supported");
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
