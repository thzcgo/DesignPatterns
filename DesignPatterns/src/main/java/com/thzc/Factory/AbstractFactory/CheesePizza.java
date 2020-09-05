package com.thzc.Factory.AbstractFactory;


/**
 * 奶酪披萨
 */
public class CheesePizza extends Pizza {

    /**
     * 原料工厂
     */
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();

    }
}
