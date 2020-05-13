package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileUploadTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp (){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(4000);
        //driver.quit();
    }

    @Test
    public void upload(){

        driver.get("http://practice.cybertekschool.com/upload");

        String projectPath= System.getProperty("user.dir");
        String relativePath = "src/test/resources/testFile.txt";

        String file = projectPath+ "/" + relativePath;

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys(file);
        driver.findElement(By.id("file-submit"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",driver.findElement(By.id("file-submit")));


    }




}
