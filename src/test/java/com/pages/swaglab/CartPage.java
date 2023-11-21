package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CartPage {
    @Test
    public void CartPage()throws Exception{
        System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver-win64/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/cart.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".subheader"));
        System.out.println("Checkout Overviwes Shows ");
        driver.findElement(By.cssSelector(".cart_desc_label"));
        System.out.println("DESCRIPTION Element Finded");
        driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
        System.out.println("Item is Checked Out");
//        driver.findElement(By.xpath("//a[@class='btn_secondary']")).click();
        driver.findElement(By.id("first-name")).sendKeys("Sarthak");
        driver.findElement(By.id("last-name")).sendKeys("Dadas");
        driver.findElement(By.id("postal-code")).sendKeys("413102");
        driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
//        driver.findElement(By.xpath("//a[@class='cart_cancel_link btn_secondary']")).click();
        driver.findElement(By.cssSelector("div[class='summary_info'] div:nth-child(2)"));
        System.out.println("SauceCard Element is Printed");
        driver.findElement(By.cssSelector("div[class='summary_info'] div:nth-child(2)"));
        System.out.println("Shipping Information Element is Printed");
        driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
        System.out.println("Check Out Finish Element is Printed");
        driver.findElement(By.cssSelector(".complete-header"));
        System.out.println("THANK YOU FOR YOUR ORDER");




}}
