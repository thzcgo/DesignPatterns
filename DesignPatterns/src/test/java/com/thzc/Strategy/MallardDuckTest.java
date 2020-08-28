package com.thzc.Strategy;
import org.junit.Test;

public class MallardDuckTest {

    @Test
    public void test() {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
    }

}