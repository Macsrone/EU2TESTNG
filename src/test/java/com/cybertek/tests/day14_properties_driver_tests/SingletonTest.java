package com.cybertek.tests.day14_properties_driver_tests;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test1(){


        Driver.get().get("http://www.amazon.com");
        //driver.quit();

    }

    @Test
    public void test2(){


        Driver.get().get("http://www.facebook.com");
        //driver.quit();

    }
}
