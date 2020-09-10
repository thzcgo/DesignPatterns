package com.thzc.Iterator.version1;

import org.junit.Test;

import static org.junit.Assert.*;

public class WaitressTest {

    @Test
    public void test() {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
        waitress.printMenu();

    }

}