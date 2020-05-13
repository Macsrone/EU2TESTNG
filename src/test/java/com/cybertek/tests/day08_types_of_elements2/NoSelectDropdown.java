package com.cybertek.tests.day08_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

    @Test

    public void Test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. Locate your dropdown just like any other webelement with unique locator
        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));

        dropdownElement.click();

        List<WebElement> dropdownOptions =  driver.findElements(By.className("dropdown-item"));

        for (WebElement option : dropdownOptions) {
            System.out.println(option.getText());
        }

        dropdownOptions.get(2).click();

        driver.quit();
    }

}
