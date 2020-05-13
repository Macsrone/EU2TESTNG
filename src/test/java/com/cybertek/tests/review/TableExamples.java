package com.cybertek.tests.review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableExamples {


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void printTable2() throws InterruptedException {
        WebElement table2 = driver.findElement(By.id("table2"));
        System.out.println(table2.getText());


    }
    @Test
    public void getAllHeaders(){

        List<WebElement> headers = driver.findElements(By.xpath("//table[2]//tr/th"));

        System.out.println(headers.size());

        for (WebElement header : headers) {
            System.out.println(header.getText());
        }

    }

    @Test
    public void printTableSize(){
        List<WebElement> headers = driver.findElements(By.xpath("//table[2]//tr/th"));

        System.out.println(headers.size());

        List<WebElement> rowsWithHead = driver.findElements(By.xpath("//table[2]//tr"));
        System.out.println(rowsWithHead.size());

        List<WebElement> rowsWithoutHead = driver.findElements(By.xpath("//table[2]//tbody/tr"));
        System.out.println(rowsWithoutHead.size());


    }

    @Test
    public void getRow(){
        WebElement firstRow = driver.findElement(By.xpath("//table[2]//tbody/tr"));
        System.out.println(firstRow.getText());

        List<WebElement> allTheRows = driver.findElements(By.xpath("//table[2]//tbody/tr"));
        for (int i = 1; i <=allTheRows.size() ; i++) {
            WebElement rows = driver.findElement(By.xpath("//table[2]//tbody/tr[" + i + "]"));
            System.out.println(rows.getText());
        }


    }

    @Test
    public void getAllCellInOneRow(){
        List<WebElement> allrows = driver.findElements(By.xpath("//table[2]//tbody/tr[3]/td"));

        for (WebElement allrow : allrows) {
            System.out.println(allrow.getText());
        }

    }

    @Test
    public void getAsingleCellByIndex(){
        List<WebElement> allrows = driver.findElements(By.xpath("//table[2]//tbody/tr[3]/td[2]"));
        for (WebElement allrow : allrows) {
            System.out.println(allrow.getText());
        }
        WebElement oneElement = driver.findElement(By.xpath("//table[2]//tbody/tr[3]/td[3]"));
        System.out.println(oneElement.getText());

    }


   @Test
   public void printAllCellByIndex() {
        int columnNumber = getNumberOfColumns();
        int rowNumber = getNumberOfRows();
       for (int i = 1; i <=rowNumber ; i++) {
           for (int j = 1; j <=columnNumber ; j++) {
               System.out.println(driver.findElement(By.xpath("//table[2]/tbody/tr[" + i + "]/td["+j+"]")).getText());
           }
       }

   }

    private int getNumberOfColumns() {
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        return headers.size();
    }

    private int getNumberOfRows() {
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return allRows.size();
    }
}