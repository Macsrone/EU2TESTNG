package com.cybertek.tests.day01_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatsAppWebTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://web.whatsapp.com/");
        // bu arada whatsapp web i açmak için karekod u okutmak gerekiyor telefona
        Thread.sleep(10000);
        //g2_cyberDE daha önce mesaj attığınız kişilerden birini seçiyor şimdilik. Rehberinizden istediğinizi seçebilirsiniz :)
        WebElement osman = driver.findElement(By.xpath("//*[@class='_3j7s9']//span[contains(text(),'Artista')]"));
        osman.click();
        Thread.sleep(5000);
        WebElement messageBox = driver.findElement(By.xpath("//*[@class='_1Plpp']"));
        Thread.sleep(1000);
        for(int i= 0; i<1; i++) {
            messageBox.sendKeys("Sevgilim seni çok seviyorum ");
            Thread.sleep(1000);
            messageBox.sendKeys(Keys.ENTER);
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
