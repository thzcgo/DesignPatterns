package com.thzc.Factory.SimpleFactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaStoreTest {

    @Test
    public void test() {
        PizzaStore pizzaStore = new PizzaStore(new PizzaSimpleFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);

    }

}