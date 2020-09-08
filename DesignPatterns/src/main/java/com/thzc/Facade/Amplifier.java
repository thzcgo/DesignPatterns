package com.thzc.Facade;


/**
 * 扩音器
 */
public class Amplifier {

    public void on() {
        System.out.println("打开扩音器");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("设置dvd");
    }

    public void setSurroundSound() {
        System.out.println("打开立体环绕模式");
    }

    public void setVolume(int i) {
        System.out.println("设置音量"+i+"级");
    }

    public void off() {
        System.out.println("关闭扩音器");
    }
}
