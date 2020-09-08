package com.thzc.TemplateMethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("烧水");
    }

    void pourInCup() {
        System.out.println("倒入杯子");
    }
}
