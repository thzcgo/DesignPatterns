package com.thzc.State;

public class WinnerState implements State{
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("非法操作");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("非法操作");
    }

    @Override
    public void turnCrank() {
        System.out.println("非法操作");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("你得到了额外的奖励多得一颗糖果");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("糖果机售空！");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }


    @Override
    public void refill() {
        System.out.println("非法操作");
    }
}
