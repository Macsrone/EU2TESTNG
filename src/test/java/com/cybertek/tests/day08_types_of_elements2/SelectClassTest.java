package com.cybertek.tests.day08_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;
import java.util.List;

public class SelectClassTest {

    @Test

    public void Test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. Locate your dropdown just like any other webelement with unique locater
        WebElement dropdownElement = driver.findElement(By.id("state"));

        //2. Create Select object by passing that element as a contructor
        Select stateDropdown = new Select(dropdownElement);

        //Get options --> returns all the available from the dropdown list
        List<WebElement> options = stateDropdown.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        driver.quit();


    }
    @Test
    public void Test2() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. Locate your dropdown just like any other webelement with unique locater
        WebElement dropdownElement = driver.findElement(By.id("state"));

        //2. Create Select object by passing that element as a contructor
        Select stateDropdown = new Select(dropdownElement);

        String expectedOption = "Select a State";
        String actualSelection = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection,expectedOption,"Verify first selection option");

        //How to select options from dropdown?
        // 1. select using visible text
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Virginia");

        Thread.sleep(2000);

        expectedOption = "Virginia";
        actualSelection = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection,expectedOption);

        //2. select using index
        Thread.sleep(2000);
        stateDropdown.selectByIndex(51);

        expectedOption = "Wyoming";
        actualSelection = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection,expectedOption);

        //3. SELECT BY VALUE
        Thread.sleep(2000);
        stateDropdown.selectByValue("DC");
        expectedOption = "District Of Columbia";
        actualSelection = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection,expectedOption);

        Thread.sleep(2000);




        driver.quit();


    }




}
