package com.thzc.Factory.FactoryMethod;

public class BStyleClamPizza extends Pizza {


    public BStyleClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
