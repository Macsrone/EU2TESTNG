package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test
    public void test1(){
        String browser = ConfigurationReaderReview.get("browser");
        System.out.println(browser);

        WebDriver driver = WebDriverFactory.getDriver(browser);

    }

}
