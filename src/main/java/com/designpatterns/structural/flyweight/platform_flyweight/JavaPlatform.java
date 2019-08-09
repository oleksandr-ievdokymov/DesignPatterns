package com.designpatterns.structural.flyweight.platform_flyweight;

import com.designpatterns.structural.flyweight.Code;

public class JavaPlatform implements Platform {

    public JavaPlatform() {
        System.out.println("Creating Java platform");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Executing code: " + code.getCode());
    }
}
