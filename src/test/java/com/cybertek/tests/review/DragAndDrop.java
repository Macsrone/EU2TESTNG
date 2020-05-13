package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(4000);
            //driver.quit();
    }

    @Test
    public void test() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.findElement(By.xpath("//button[@title='Accept Cookies']")).click();
        Thread.sleep(5000);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions= new Actions(driver);

        actions.dragAndDrop(source,target).perform();


    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.findElement(By.xpath("//button[@title='Accept Cookies']")).click();
        Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        for (int i = 0; i <10 ; i++) {
            Thread.sleep(500);
            jse.executeScript("window.scrollBy(0, 25);");
        }

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions= new Actions(driver);

        actions.moveToElement(source).clickAndHold().moveToElement(target).pause(2000).release().perform();


    }



}
