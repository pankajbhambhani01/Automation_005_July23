package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
    @Test
    public void HomePage() throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//option[text()='Name (A to Z)']")).click();
        System.out.println("Products are sorted as A to z ");
        driver.findElement(By.xpath("//option[text()='Name (Z to A)']")).click();
        System.out.println("Products are sorted as Z to A");
        driver.findElement(By.xpath("//option[text()='Price (low to high)']")).click();
        System.out.println("As per price low to high");
        driver.findElement(By.xpath("//option[text()='Price (high to low)']")).click();
        System.out.println("As per price high to low");

    }

}

