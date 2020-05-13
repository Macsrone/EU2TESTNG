package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class AttributeTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        //driver.quit();
    }
    @Test
    public void test(){
        driver.get("https://translate.google.com/");
        WebElement english = driver.findElement(By.id("sugg-item-en"));
        System.out.println(english.getText());
        System.out.println(english.getAttribute("value"));
        System.out.println("english.getAttribute(\"innerHTML\") = " + english.getAttribute("innerHTML"));
        System.out.println("english.getAttribute(\"outerHTML\") = " + english.getAttribute("outerHTML"));


    }



}
