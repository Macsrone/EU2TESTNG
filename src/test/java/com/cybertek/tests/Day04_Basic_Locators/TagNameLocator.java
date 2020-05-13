package com.cybertek.tests.Day04_Basic_Locators;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocator {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullnameInputBox = driver.findElement(By.tagName("input"));

        fullnameInputBox.sendKeys(Faker.instance().backToTheFuture().character());

        driver.findElement(By.name("email")).sendKeys("sds@gmail.com");

        driver.findElement(By.name("wooden_spoon")).click();

        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}
