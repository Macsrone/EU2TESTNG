package com.cybertek.tests.day05_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys("pillow");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result = driver.findElement(By.xpath("(//span[contains(text(),'result for')])"));

        System.out.println(result.getText());

       // driver.quit();
    }
}
