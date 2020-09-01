package com.thzc.decorator.Coffee;

/**
 * 抽象装饰者
 * Condiment（调料）
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
