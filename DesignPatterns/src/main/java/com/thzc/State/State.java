package com.thzc.State;

public interface State {

    void insertQuarter(); //放入硬币
    void ejectQuarter();  //退出硬币
    void turnCrank();  //转动曲轴
    void dispense();  //分配糖果

    void refill();
}
