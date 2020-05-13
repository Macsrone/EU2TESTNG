package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dataProviderTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @DataProvider
    public Object[][] testData() {

        Object [][] obj = new Object[2][2];
        obj[0][0] = "Cihat";
        obj[0][1] = "Turabi";
        obj[1][0] = "Yapici";
        obj[1][1] = "Yetisgen";

        return obj;
    }

    @Test(dataProvider = "testData")
    public void test1(String s1,String s2){
        System.out.println(s1+" "+ s2);

    }

    @DataProvider
    public Object[] testData2() {
        return new Object [] {123,98,656,121,487,656,32};
    }

    @Test(dataProvider = "testData2")
    public void test2(int n1){
        System.out.println(n1);

    }

}
