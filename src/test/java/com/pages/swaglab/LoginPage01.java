package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage01 {

    @Test
    public void testcase_01() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        Thread.sleep(4000);

        driver.manage().window().maximize();

        WebElement element;
        element = driver.findElement(By.name("user-name"));
        element.sendKeys("performance_glitch_user");
        element = driver.findElement(By.name("password"));
        element.sendKeys("secret_sauce");
        Thread.sleep(3000);
        element = driver.findElement(By.id("login-button"));
        element.click();

        String act_title = "Swag Labs";
        String exp_title = driver.getTitle();

        //System.out.println(exp_title);

        Assert.assertEquals(exp_title,"Swag Labs");

//        if(exp_title.equals(act_title)==true)
//        {
//            System.out.println("Test is passed");
//        }
//        else
//        {
//            System.out.println("Test is failed");
//        }
        driver.close();

    }
}
