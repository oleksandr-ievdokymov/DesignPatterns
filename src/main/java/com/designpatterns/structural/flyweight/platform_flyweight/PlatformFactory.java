package com.designpatterns.structural.flyweight.platform_flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlatformFactory {

    private static Map<String, Platform> platformMap = new HashMap<>();

    private PlatformFactory() {
    }

    public static Platform getPlatform(String platformType) {
        Platform platform = platformMap.get(platformType);
        if(platform == null) {
            switch (platformType) {
                case "Java": platform = new JavaPlatform();
                break;
                case "C": platform = new CPlatform();
            }
            platformMap.put(platformType, platform);
        }
        return platform;
    }
}
