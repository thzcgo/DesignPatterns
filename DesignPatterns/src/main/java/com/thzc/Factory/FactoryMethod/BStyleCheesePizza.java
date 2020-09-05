package com.thzc.Factory.FactoryMethod;

public class BStyleCheesePizza extends Pizza {

    public BStyleCheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
