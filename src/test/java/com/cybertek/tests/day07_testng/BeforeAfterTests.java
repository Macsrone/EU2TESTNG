package com.cybertek.tests.day07_testng;

import org.testng.annotations.*;

public class BeforeAfterTests {


    @Test
    public void test1 (){
        // WebDriver part
        System.out.println("This is my test 1");
        // close browser,quit
    }

    @Test
    public void test2 (){
        // WebDriver part
        System.out.println("This is my test 2");
        // close browser,quit
    }
    @Test
    public void test3 (){
        // WebDriver part
        System.out.println("This is my test 3");
        // close browser,quit
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("BEFORE METHOD HERE");
        System.out.println("WebDriver Part");

    }

    @AfterMethod
    public void tearDown(){
        System.out.println("AFTER METHOD HERE");
        System.out.println("Driver quit");

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORE CLASS");
        System.out.println("-------------");

    }

    @AfterClass
    public void afterClass(){
        System.out.println("-------------");
        System.out.println("AFTER CLASS");
    }
}
