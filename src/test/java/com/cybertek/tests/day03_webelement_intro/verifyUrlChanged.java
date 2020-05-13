package com.cybertek.tests.day03_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlChanged {

    public static void main(String[] args) {

        /**
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * click on Retrieve password
         * verify that url changed to http://practice.cybertekschool.com/email_sent
         */

        //open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //navigate website
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));

        //sendKeys()--> send keyboard action to the web element
        emailInputBox.sendKeys(Faker.instance().internet().emailAddress());

        //click pn retrieve button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //verify that url changed to http://practice.cybertekschool.com/email_sent
        String expectedResult = "http://practice.cybertekschool.com/email_sent";

        //get current url from browser and save as an actual
        String actualUrl = driver.getCurrentUrl();

        if (expectedResult.equals(actualUrl)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualUrl" + actualUrl);
            System.out.println("expectedUrl" + expectedResult);
        }


        //close the browser
        driver.quit();
    }

}
