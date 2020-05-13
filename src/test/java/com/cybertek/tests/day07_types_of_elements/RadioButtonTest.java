package com.cybertek.tests.day07_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void radioBtnTest1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.id("blue"));

        WebElement redRadioButton = driver.findElement(By.id("red"));

        //how to check is radio button selected ?

        System.out.println("blueRadioButton.isSelected()" +blueRadioButton.isSelected());
        System.out.println("redRadioButton.isSelected()"+redRadioButton.isSelected());


        //task verify blue is selected red is not selected

        Assert.assertTrue(blueRadioButton.isSelected());

        Assert.assertFalse(redRadioButton.isSelected());


    }



}
