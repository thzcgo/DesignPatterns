package com.thzc.Factory.AbstractFactory;

public class APizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ADough();
    }

    public Sauce createSauce() {
        return new ASauce();
    }


}
