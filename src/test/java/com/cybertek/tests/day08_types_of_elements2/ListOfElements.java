package com.cybertek.tests.day08_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {

    @Test
    public void Test1(){


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //Save our webelements inside to list
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("button.size() = " + buttons.size());

        //Verify we have 6 button
        Assert.assertEquals(buttons.size(),6);

        //Loop for each button, we can implement selenium methods
        for (WebElement button : buttons) {
            System.out.println(button.getText());
            Assert.assertTrue(button.isDisplayed());
        }

        //click only second button from the list
        buttons.get(1).click();
    }


    @Test
    public void test2(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("buttons.size() = " + buttons.size());

        WebElement button = driver.findElement(By.tagName("button"));


    }
}