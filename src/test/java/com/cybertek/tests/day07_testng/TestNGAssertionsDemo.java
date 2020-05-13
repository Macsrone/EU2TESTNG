package com.cybertek.tests.day07_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

        @Test
        public void test1(){
            System.out.println("First Assertion");
            Assert.assertEquals("title","Title");


            System.out.println("Second Assertion");
            Assert.assertEquals(1,1);
        }

        @Test
        public void test3() {

            String expectedTitle = "Cyb";
            String actualTitle = "Cybertek";
            //verify that your title is starting with Cyb

            Assert.assertTrue(actualTitle.startsWith(expectedTitle));
            Assert.assertTrue(2>1,"i am checking is 2 greater than 1 ");










        }

}
