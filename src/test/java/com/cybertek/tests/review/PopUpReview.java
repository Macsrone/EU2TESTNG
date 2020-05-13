package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PopUpReview {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        //driver.quit();
    }
    @Test
    public void test(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        driver.findElement(By.xpath("//span[.='Destroy the World']")).click();

        driver.findElement(By.xpath("//span[.='No']")).click();

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        List<WebElement> elements = driver.findElements(By.cssSelector(".btn.btn-primary"));
        System.out.println("elements.size() = " + elements.size());

        //first button
        elements.get(0).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        alert.accept();

        Thread.sleep(7000);
        //second button
        elements.get(1).click();
        Thread.sleep(5000);
        alert.accept();

        Thread.sleep(7000);
        //second button
        elements.get(2).click();
        alert.sendKeys("Turabi");
        Thread.sleep(5000);
        alert.accept();






    }

}
