package com.thzc.Facade;

public class DvdPlayer {


    public void play(String movie) {
        System.out.println("开始看电影："+movie);
    }

    public void on() {
        System.out.println("打开DVD");
    }

    public void stop() {
        System.out.println("停止DVD");
    }

    public void eject() {
        System.out.println("弹出dvd盘片");
    }

    public void off() {
        System.out.println("关闭dvd");
    }
}
