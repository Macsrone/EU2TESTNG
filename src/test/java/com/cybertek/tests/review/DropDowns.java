package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDowns {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test()
    public void turabi(){

        WebElement firstDropdown = driver.findElement(By.id("dropdown"));

        Select options = new Select(firstDropdown);
        System.out.println("options.getFirstSelectedOption() = " + options.getFirstSelectedOption().getText());

//        options.selectByIndex(2);
//        options.selectByVisibleText("Option 1");
//        options.selectByValue("2");
        List<WebElement> allOptions = options.getOptions();

        for (WebElement allOption : allOptions) {
            System.out.println(allOption.getText());
        }

        allOptions.get(2).click();
    }



    @Test()
    public void cihat(){

//        WebElement year = driver.findElement(By.id("year"));
//
//        Select Year = new Select(year);
//        Year.selectByVisibleText("1980");
//
//        WebElement month = driver.findElement(By.id("month"));
//
//        Select Month = new Select(month);
//        Month.selectByValue("1");
//
//        WebElement day = driver.findElement(By.id("day"));
//
//        Select Day = new Select(day);
//        Day.selectByIndex(3);

        //--------------------------------------------------------

//        WebElement state = driver.findElement(By.id("state"));
//        Select State = new Select(state);
//        State.selectByValue("KY");
//

      //----------------------------------------------------------
//        WebElement languages = driver.findElement(By.name("Languages"));
//
//        Select language = new Select(languages);
//
//        List<WebElement> options = language.getOptions();
//        for (WebElement option : options) {
//            System.out.println(option.getText());
//
//        }

        //----------------------------------------------------------

        WebElement dropdownMenuLink = driver.findElement(By.id("dropdownMenuLink"));

        dropdownMenuLink.click();

        List<WebElement> links = driver.findElements(By.cssSelector(".dropdown-item"));

        for (WebElement link : links) {
            System.out.println(link.getText());
        }
        links.get(3).click();


    }

}