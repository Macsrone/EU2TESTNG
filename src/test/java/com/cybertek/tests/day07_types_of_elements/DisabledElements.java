package com.cybertek.tests.day07_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenRadioButton = driver.findElement(By.id("green"));

        System.out.println(greenRadioButton.isEnabled());
        Assert.assertFalse(greenRadioButton.isEnabled());

    }
    @Test
    public void test2(){
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

            driver.get("http://practice.cybertekschool.com/dynamic_controls");

            WebElement inputbox = driver.findElement(By.cssSelector("#input-example>input"));

            inputbox.sendKeys("Mike");



        }
    }


