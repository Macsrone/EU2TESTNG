package com.cybertek.tests.day06_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement dontClick =  driver.findElement(By.cssSelector("button#disappearing_button"));
        System.out.println(dontClick.getText());
    }
}