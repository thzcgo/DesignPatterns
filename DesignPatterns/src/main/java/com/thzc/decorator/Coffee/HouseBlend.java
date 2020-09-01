package com.thzc.decorator.Coffee;

/**
 * 具体组件
 * 黑咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
}