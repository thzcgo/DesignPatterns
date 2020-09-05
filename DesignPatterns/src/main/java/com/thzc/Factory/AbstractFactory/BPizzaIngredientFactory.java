package com.thzc.Factory.AbstractFactory;

public class BPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new BDough();
    }

    public Sauce createSauce() {
        return new BSauce();
    }


}