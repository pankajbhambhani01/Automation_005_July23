package com.testcases.orangehrm;

import com.utility.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase_3 {
    public static void main(String[] args) throws Exception{
        //https://only-testing-blog.blogspot.com/
        Browser br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl("https://only-testing-blog.blogspot.com/");
        WebDriver driver = br.getDriver();
        Thread.sleep(5000);// 5 sec wait
        WebElement element;
        element = driver.findElement(By.xpath("//input[@id='gparent_1'"));
        element.sendKeys("TestingGP1");
        element = driver.findElement(By.xpath("//input[@id='gparent_1']//parent::div"));
        System.out.println(element.getText());
    }
}
