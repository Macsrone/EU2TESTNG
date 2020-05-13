package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListOfELementsTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void test(){
        List<WebElement> button = driver.findElements(By.tagName("Button"));
        System.out.println(button.size());

        for (WebElement buttons : button) {
            System.out.println(buttons.getText());
        }
        for (int i = 0; i <button.size() ; i++) {
            System.out.println(button.get(i).getText());
        }
        System.out.println("-----------------------------");

        button.forEach(b -> System.out.println(b.getText()));

    }
}

