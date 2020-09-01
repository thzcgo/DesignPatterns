package com.thzc.decorator.Coffee;

/**
 * 具体组件
 * 浓缩咖啡
 * （Espresso）
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
