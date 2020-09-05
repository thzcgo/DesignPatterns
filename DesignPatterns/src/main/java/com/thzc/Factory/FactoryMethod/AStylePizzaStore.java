package com.thzc.Factory.FactoryMethod;


/**
 * A类型的Pizza商店
 */
public class AStylePizzaStore extends PizzaStore{

    private Pizza pizza;

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new AStyleCheesePizza();
            return pizza;
        }else if (type.equals("clam")) {
            pizza = new AStyleClamPizza();
            return pizza;
        }else {
            return null;
        }
    }
}
