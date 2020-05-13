package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iframeReview {
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
    public void test1(){
        driver.get("http://practice.cybertekschool.com/iframe");
        WebElement iframe = driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame("mce_0_ifr");


       // driver.switchTo().frame(iframe);

        WebElement inuptBox = driver.findElement(By.cssSelector("#tinymce"));
        inuptBox.clear();
        inuptBox.sendKeys("fbdsafsf");

        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        inuptBox.clear();
        inuptBox.sendKeys("hfsadfs");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(iframe);

        inuptBox.clear();
        inuptBox.sendKeys("teatewtewt");


    }

    @Test
    public void test3(){

        driver.get("http://practice.cybertekschool.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");

        String body = driver.findElement(By.xpath("//body[1]")).getText();
        System.out.println(body);

        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        String middle = driver.findElement(By.id("content")).getText();
        System.out.println(middle);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        String bottom = driver.findElement(By.tagName("body")).getText();
        System.out.println(bottom);

    }


}
