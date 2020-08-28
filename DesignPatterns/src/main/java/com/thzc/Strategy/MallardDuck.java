package com.thzc.Strategy;


/**
 * 绿头鸭 会飞 会呱呱叫
 */
public class MallardDuck extends Duck{


    public MallardDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }


    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }
}
