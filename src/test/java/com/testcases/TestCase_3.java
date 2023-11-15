package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_3 {
    public static void main(String[] args) throws Exception{
        //https://only-testing-blog.blogspot.com/
        System.setProperty("webdriver.chrome.driver", "C:/Users/Pankaj Bhambhani/Downloads/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2022/11/relationship.html");
        Thread.sleep(5000);// 5 sec wait
        WebElement element;
        element = driver.findElement(By.xpath("//input[@id='gparent_1'"));
        element.sendKeys("TestingGP1");
        element = driver.findElement(By.xpath("//input[@id='gparent_1']//parent::div"));
        System.out.println(element.getText());
    }
}
