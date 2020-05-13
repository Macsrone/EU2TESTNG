package com.cybertek.tests.day05_xpath;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class XpathLocatorDemo {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement button2 = driver.findElement(By.xpath("//button[.='Sign Up']"));

        button2.click();
    }
}