package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindowsReview {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        //driver.quit();
    }
    @Test
    public void forTwoTabtest(){
        driver.findElement(By.linkText("Click Here")).click();

        String windowHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println(windowHandles.size());

        for (String handle : windowHandles) {
            if (!windowHandle.equals(handle)){
                driver.switchTo().window(handle);
            }

        }

        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void forMultipleTabtest(){
        driver.findElement(By.linkText("Click Here")).click();

        String title = "New Window";

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().equals(title)){
                break;
            }
        }
        System.out.println(driver.getTitle());


    }


}
