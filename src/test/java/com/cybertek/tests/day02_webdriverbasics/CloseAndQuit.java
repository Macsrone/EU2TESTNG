package com.cybertek.tests.day02_webdriverbasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       //  driver.get("http:practice.cybertekschool.com");

        //wait 2 seconds
        //Thread.sleep(2000);

        //close the current tab/window
        //driver.close();


        driver.get("http:practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);

        //driver.close();

        //close all tabs
        driver.quit();





    }

}
