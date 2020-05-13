package com.cybertek.tests.Day04_Basic_Locators;


import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullnameInputBox = driver.findElement(By.name("full_name"));

        fullnameInputBox.sendKeys(Faker.instance().lordOfTheRings().character());

        WebElement email = driver.findElement(By.name("email"));

        email.sendKeys(Faker.instance().internet().emailAddress());


        WebElement SendButton= driver.findElement(By.name("wooden_spoon"));

        SendButton.click();


        WebElement ShowMessage = driver.findElement(By.name("signup_message"));

        String expectedResult = "Thank you for signing up. Click the button below to return to the home page.";

        String Message = ShowMessage.getText();

        System.out.println(Message);
        if (Message.equals(expectedResult)){
            System.out.println("pass");
        }else
            System.out.println("fail");


        driver.navigate().back();






    }


}
