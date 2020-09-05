package com.thzc.Factory.AbstractFactory;

public class BPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new BPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("B Style Cheese Pizza");
        }  else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("B Style Clam Pizza");
        }
        return pizza;
    }
}