package com.thzc.Iterator;

import com.thzc.Iterator.version0.DinerMenu;
import com.thzc.Iterator.version0.PancakeHouseMenu;
import com.thzc.Iterator.version0.Waitress;
import org.junit.Test;

public class WaitressTest {

    @Test
   public void test() {
       DinerMenu dinerMenu = new DinerMenu();
       PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

       Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);

       waitress.printMenu();

   }
}