package com.cybertek.tests.EU2_Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {


    WebDriver driver;
    @BeforeMethod
    public void setUpMethods(){
        driver = WebDriverFactory.getDriver("chrome");

    }
//    @AfterMethod
//    public void afterMethod() throws InterruptedException{
//        Thread.sleep(2000);
//        driver.quit();
//    }


    @Test
    //test1
    public void RegistrationForm(){
        //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”Step
        // 2. Click on “Registration Form”Step
        // 3. Enter “wrong_dob” into date of birth input box.Step
        // 4. Verify that warning message is displayed: “The date of birth is not valid”

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.partialLinkText("Registration Form")).click();

        driver.findElement(By.name("birthday")).sendKeys("wrong_dob");

        String actualResult = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/small[2]")).getText();

        String expectedResult = "The date of birth is not valid";

        Assert.assertEquals(actualResult,expectedResult);
    }



    @Test
    //test02
    public void test02() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.partialLinkText("Registration Form")).click();
        Thread.sleep(2000);

        String checkbox1 = driver.findElement(By.xpath("//*[@for=\"inlineCheckbox1\"]")).getText();

        String expectedCheckBox1= "C++";

        Assert.assertEquals(checkbox1,expectedCheckBox1);

        String checkbox2 = driver.findElement(By.xpath("//*[@for=\"inlineCheckbox2\"]")).getText();

        String expectedCheckBox2= "Java";

        Assert.assertEquals(checkbox2,expectedCheckBox2);

        String checkbox3 = driver.findElement(By.xpath("//*[@for=\"inlineCheckbox3\"]")).getText();

        String expectedCheckBox3= "JavaScript";

        Assert.assertEquals(checkbox3,expectedCheckBox3);


    }

    @Test
    //test03
    /*Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
    Step 2. Click on “Registration Form”
    Step 3. Enter only one alphabetic character into first name input box.
    Step 4. Verify that warning message is displayed:
     “first name must be more than 2 and less than 64 characters long”

     */
    public void test03() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.partialLinkText("Registration Form")).click();

        driver.findElement(By.name("firstname")).sendKeys("a");
        String actualResult = driver.findElement(By.cssSelector("small[data-bv-validator=\"stringLength\"]")).getText();
        String expectedResult = "first name must be more than 2 and less than 64 characters long";

        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void test04() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.partialLinkText("Registration Form")).click();

        driver.findElement(By.name("lastname")).sendKeys("a");
        String actualResult = driver.findElement(By.cssSelector("small[data-bv-validator=\"stringLength\"]")).getText();
        String expectedResult = "The last name must be more than 2 and less than 64 characters long";

        Assert.assertEquals(actualResult,expectedResult);

    }







}
