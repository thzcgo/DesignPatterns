package com.thzc.Singleton;

public class HurrySingleton {
    private static HurrySingleton uniqueInstance = new HurrySingleton();

    private HurrySingleton(){}

    public HurrySingleton getInstance() {
        return uniqueInstance;
    }
}
