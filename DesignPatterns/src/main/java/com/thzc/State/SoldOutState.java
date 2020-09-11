package com.thzc.State;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你插不进25美分，这台机器卖完了");
}

    @Override
    public void ejectQuarter() {
        System.out.println("你不能弹出，你还没有插入硬币");
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动曲轴，但没有口香糖");
    }

    @Override
    public void dispense() {
        System.out.println("没有口香糖可以下放");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
