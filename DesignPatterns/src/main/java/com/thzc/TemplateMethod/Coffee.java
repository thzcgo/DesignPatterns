package com.thzc.TemplateMethod;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("冲泡咖啡");
    }
    @Override
    public void addCondiments() {
        System.out.println("添加糖和牛奶");
    }
}

