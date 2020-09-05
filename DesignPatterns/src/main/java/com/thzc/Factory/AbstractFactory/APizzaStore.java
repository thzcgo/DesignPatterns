package com.thzc.Factory.AbstractFactory;

public class APizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new APizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("A Style Cheese Pizza");
        }  else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("A Style Clam Pizza");
        }
        return pizza;
    }
}
