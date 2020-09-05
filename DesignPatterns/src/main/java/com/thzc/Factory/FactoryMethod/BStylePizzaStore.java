package com.thzc.Factory.FactoryMethod;

/**
 * B类型的Pizza商店
 */
public class BStylePizzaStore extends PizzaStore{

    private Pizza pizza;

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new BStyleCheesePizza();
            return pizza;
        }else if (type.equals("clam")) {
            pizza = new BStyleClamPizza();
            return pizza;
        }else {
            return null;
        }
    }
}