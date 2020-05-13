package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JsCommand {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(4000);
        //driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/");

        WebElement dropdown = driver.findElement(By.linkText("Dropdown"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].click();",dropdown);

    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement inputbox = driver.findElement(By.xpath("//input[@type='text']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String text = "Test Message";
        jse.executeScript("arguments[0].value='"+text+"';", inputbox);
        //jse.executeScript("arguments[0].setAttribute('value', '" + text +"')",inputBox);

    }
    @Test
    public void scrollDownAndUp() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        for (int i = 0; i <10 ; i++) {
            Thread.sleep(500);
            jse.executeScript("window.scrollBy(0, 1000);");
        }
        for (int i = 0; i <10 ; i++) {
            Thread.sleep(500);
            jse.executeScript("window.scrollBy(0, -250);");
        }
    }

}
