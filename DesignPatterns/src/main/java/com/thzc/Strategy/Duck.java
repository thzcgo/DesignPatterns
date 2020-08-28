package com.thzc.Strategy;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("游泳");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
