package com.mytc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        WebElement element;
        element = driver.findElement(By.name("username"));
        element.sendKeys("Admin");
        element = driver.findElement(By.name("password"));
        element.sendKeys("admin123");
        element = driver.findElement(By.tagName("button"));
        element.click();

    }
}
