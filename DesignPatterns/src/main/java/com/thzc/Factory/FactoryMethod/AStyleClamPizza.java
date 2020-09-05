package com.thzc.Factory.FactoryMethod;

public class AStyleClamPizza extends Pizza{

    public AStyleClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }

}
