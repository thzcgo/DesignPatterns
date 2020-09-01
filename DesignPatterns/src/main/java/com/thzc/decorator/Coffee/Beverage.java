package com.thzc.decorator.Coffee;


/**
 * 抽象组件
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * cost()必须在子类中实现
     */
    public abstract double cost();
}