package com.designpatterns.structural.flyweight;

import com.designpatterns.structural.flyweight.platform_flyweight.Platform;
import com.designpatterns.structural.flyweight.platform_flyweight.PlatformFactory;

public class Main {

    public static void main(String[] args) {
        Code code = new Code();
        code.setCode("C code");
        Platform platform = PlatformFactory.getPlatform("C");
        platform.execute(code);

        code = new Code();
        code.setCode("Java code");
        platform = PlatformFactory.getPlatform("Java");
        platform.execute(code);
    }
}
