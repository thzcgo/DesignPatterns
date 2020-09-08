package com.thzc.Adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurkeyAdapterTest {

    @Test
    public void test() {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(wildTurkey);

        adapter.fly();
        adapter.quack();

    }
}