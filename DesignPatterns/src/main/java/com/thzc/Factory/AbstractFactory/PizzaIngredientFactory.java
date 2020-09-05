package com.thzc.Factory.AbstractFactory;

public interface PizzaIngredientFactory {

    /**
     * @return 面团
     */
    public Dough createDough();

    /**
     * @return 酱油
     */
    public Sauce createSauce();

}
