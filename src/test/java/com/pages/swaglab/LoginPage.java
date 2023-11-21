package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
    @Test
    public void LoginPage() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver-win64/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println("Login is:Successfully");

//        driver.findElement(By.xpath("//img[@src='img/Login_Bot_graphic.png']"));
//        System.out.println("SwagLab Text is Displayed");
//        driver.findElement(By.xpath("//div[@class='login_logo']"));
//        System.out.println("SwagLab Image is Displayed");


       String CurrentWindowHandle= driver.getWindowHandle();
       driver.switchTo().window(CurrentWindowHandle);
       driver.findElement(By.className("bm-burger-button"));


    }}

