package com.cybertek.tests.day08_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayDemoTest {

    @Test
    public void Test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput = driver.findElement(By.id("username"));

        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());

        // task
        Assert.assertFalse(usernameInput.isDisplayed(),"Verify username box is NOT displayed");

        driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
        Thread.sleep(5000);

        Assert.assertTrue(usernameInput.isDisplayed(),"Verify username box is displayed");

        driver.quit();









    }
}
