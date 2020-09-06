package com.thzc.Singleton;

public class VolatileSynchronizedSingleton {
    private volatile static VolatileSynchronizedSingleton uniqueInstance;

    private VolatileSynchronizedSingleton(){}

    public static VolatileSynchronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (VolatileSynchronizedSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new VolatileSynchronizedSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
