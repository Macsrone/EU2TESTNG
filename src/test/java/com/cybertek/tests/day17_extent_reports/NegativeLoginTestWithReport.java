package com.cybertek.tests.day17_extent_reports;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReport extends TestBase {


    @Test
    public void wrongPasswordTest(){

        extentLogger = report.createTest("Wrong Password Test");

        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys("user1");
        extentLogger.info("Enter Username: user1");
        loginPage.passwordInput.sendKeys("somepassword");
        extentLogger.info("Enter Password: somepassword");
        loginPage.loginBtn.click();
        extentLogger.info("click login button");

        extentLogger.info("Verify page url");
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");
        extentLogger.info("Wrong Password Test is passed");
    }

    @Test
    public void wrongUsernameTest(){

        extentLogger = report.createTest("Wrong Username Test");
        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys("someusername");
        extentLogger.info("Enter Username: someusername");
        loginPage.passwordInput.sendKeys("UserUser123");
        extentLogger.info("Enter Password: UserUser123");
        loginPage.loginBtn.click();
        extentLogger.info("Click login button");

        extentLogger.info("Verify page url");
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");
        extentLogger.info("Wrong UsernameTest is passed");
    }
}