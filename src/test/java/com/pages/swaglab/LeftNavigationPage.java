package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LeftNavigationPage {
    public static void main(String[]args) throws Exception{
        System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver-win64/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
        System.out.println("All Items Page is opened");
        driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']")).click();
        System.out.println("Product page is opened");
//        driver.findElement(By.xpath("//a[@id='about_sidebar_link']")).click();
//        System.out.println("About page is opened");
//        driver.findElement(By.cssSelector("#logout_sidebar_link']']")).click();
//        System.out.println("Logout page is Logout");
//        driver.findElement(By.xpath("//a[@id='reset_sidebar_link']")).click();
//        System.out.println("Clicked on Rest App state");
}}
