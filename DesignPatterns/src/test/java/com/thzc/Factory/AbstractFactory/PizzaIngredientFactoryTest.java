package com.thzc.Factory.AbstractFactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaIngredientFactoryTest {

    @Test
    public void test() {
        APizzaStore apizzaStore = new APizzaStore();
        Pizza cheese = apizzaStore.orderPizza("cheese");
        System.out.println(cheese);

    }

}