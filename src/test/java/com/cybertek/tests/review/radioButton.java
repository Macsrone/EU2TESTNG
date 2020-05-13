package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class radioButton {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void test(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Radio Buttons")).click();
        WebElement blue = driver.findElement(By.id("blue"));

        Assert.assertTrue(blue.isSelected(),"Verify the blue button is selected");

        WebElement yellow = driver.findElement(By.id("yellow"));

        Assert.assertFalse(yellow.isSelected(),"verfy yellow button is not selected");

        WebElement green = driver.findElement(By.id("green"));

        Assert.assertFalse(green.isEnabled(),"verify green button is not enabled");

        boolean hockey = driver.findElement(By.id("hockey")).isSelected();

        Assert.assertFalse(hockey,"verify hockey button is not selected");


    }


    @Test
    public void disabledElements() throws InterruptedException {
    driver.get("http://practice.cybertekschool.com/dynamic_controls");


       /* driver.findElement(By.cssSelector("button[type='button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(5000);

       // WebElement checkbox = driver.findElement(By.xpath("checkbox"));
       // checkbox.click();
*/
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));

       /* System.out.println("inputBox.isEnabled() = " + inputBox.isEnabled());
        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(inputBox));
        inputBox.sendKeys("sss");
        */
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("arguments[0].value='"+"Turabi"+"' ",inputBox);
        jse.executeScript("arguments[0].setAttribute('value', '" + "Turabi" +"')",inputBox);

    }


}
