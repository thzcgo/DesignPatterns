package com.thzc.Factory.FactoryMethod;

import org.junit.Test;


public class PizzaStoreTest {

    @Test
    public void test() {
        AStylePizzaStore pizzaStore = new AStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza("clam");
        pizza.toString();
    }
}