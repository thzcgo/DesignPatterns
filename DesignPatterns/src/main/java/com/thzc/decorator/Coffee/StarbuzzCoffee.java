package com.thzc.decorator.Coffee;

public class StarbuzzCoffee {

    public static void main(String args[]) {

        // 不加调料的浓缩咖啡
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        // 加了摩卡和奶泡的黑咖啡
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
