package com.thzc.Facade;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeTheaterFacadeTest {

    @Test
    public void test() {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        MoiveScreen screen = new MoiveScreen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp,tuner,dvd,
                cd,projector,lights,screen,popper);

        homeTheaterFacade.watchMovie("白日梦想家");
        homeTheaterFacade.endMovie();
    }

}