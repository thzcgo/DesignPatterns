package com.thzc.Strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("普通鸭子呱呱叫");
    }
}
