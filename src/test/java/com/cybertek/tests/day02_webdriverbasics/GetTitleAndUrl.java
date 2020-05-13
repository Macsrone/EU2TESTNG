package com.cybertek.tests.day02_webdriverbasics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cnn.com");


        //alt + enter + enter
        String title = driver.getTitle();
        //soutv + enter to print variable;
        System.out.println("title = " + title);


        String currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);


    }

}