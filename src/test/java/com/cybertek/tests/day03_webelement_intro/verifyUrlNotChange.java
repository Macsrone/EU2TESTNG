package com.cybertek.tests.day03_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlNotChange {

    public static void main(String[] args) {

        /**
         * open chrome browser
         *  go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         *click on Retrieve password
         * verify that url did not change
         */

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save url before we click retrieve password button
        String expectedUrl = driver.getCurrentUrl();

        //click on Retrieve password
        //WebElement -->Interface that represent elements on the webpage
        //findElement-->method used to find element on a webpage
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        // verify that url did not change

        //we save url after we click button
        String actualURl = driver.getCurrentUrl();

        if (actualURl.equals(expectedUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }


        //close browser after everything
        driver.close();

 }
}