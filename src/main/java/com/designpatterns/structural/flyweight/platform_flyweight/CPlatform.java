package com.designpatterns.structural.flyweight.platform_flyweight;

import com.designpatterns.structural.flyweight.Code;

public class CPlatform implements Platform {

    public CPlatform() {
        System.out.println("Creating C platform");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Executing code: " + code.getCode());
    }
}
