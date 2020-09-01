package com.thzc.decorator.Coffee;


/**
 * 具体装饰者
 * 摩卡
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}