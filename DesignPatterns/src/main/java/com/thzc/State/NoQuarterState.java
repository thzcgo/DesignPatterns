package com.thzc.State;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你插入了一枚20分硬币");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你还没有插入硬币");
    }

    @Override
    public void turnCrank() {
        System.out.println("转动曲轴，但没有硬币");
    }

    @Override
    public void dispense() {
        System.out.println("没有插入硬币");
    }

    @Override
    public void refill() {

    }
}
