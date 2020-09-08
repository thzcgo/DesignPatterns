package com.thzc.TemplateMethod;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("冲泡茶叶");
    }
    @Override
    public void addCondiments() {
        System.out.println("添加柠檬");
    }
}

