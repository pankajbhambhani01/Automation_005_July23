package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabHomePage {
    public static void main(String[]args) throws Exception{
        System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver-win64/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[text()='Name (A to Z)']")).click();

        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[text()='Name (Z to A)']")).click();

        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[text()='Name (low to high)']")).click();

        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[text()='Name (high to low)']")).click();

        driver.quit();
    }


}