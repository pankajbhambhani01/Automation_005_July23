package com.testcases.orangehrm;

import com.utility.Browser;
import com.utility.Constant_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase_5 {
    public static void main(String[] args) throws Exception {
        Browser br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl(Constant_1.url);
        WebDriver driver = br.getDriver();
        Thread.sleep(5000);// 5 sec wait
        WebElement element;
        element = driver.findElement(By.xpath("//*[@name='username']//parent::div//parent::div[contains(@class,'input-field')]//label"));
        String labelUsername = element.getText();
        if (labelUsername.equals("Username")) {
            System.out.println("the testcase is pass");
        } else {
            System.out.println("the testcase is fail");
        }
        element = driver.findElement(By.name("username"));
        element.sendKeys(Constant_1.username);
        String placeHolderUsername = element.getAttribute("placeholder");
        if (placeHolderUsername.equals("Username")) {
            System.out.println("the testcase is Pass");
        } else {
            System.out.println("the testcase is fail");
        }

        element = driver.findElement(By.xpath("//*[@name='password']//parent::div//parent::div[contains(@class,'input-field')]//label"));
        String labelPassword = element.getText();
        if (labelPassword.equals("password")) {
            System.out.println("the testcase is pass");
        } else {
            System.out.println("the testcase is fail");
        }
        element = driver.findElement(By.name("password"));
        element.sendKeys(Constant_1.password);
        String placeHolderPassword = element.getAttribute("placeholder");
        if(placeHolderPassword.equals("Password")){
            System.out.println("the testcase is pass");
        }else{
            System.out.println("the testcase is fail");
        }
        element = driver.findElement(By.cssSelector("button[class$='login-button']"));
        element.click();
    }
}
// xpath - it supports forward and backward
// CSSpath - it only support forward - faster
// tagName[attribute='value'] -> input[placeholder='Username']
// [attribute='value'] -> [placeholder='Username']
// > -> immidiate child
// contains (*)-> button[class*='orangehrm-login-button']
// starts-with (^) -> button[class^='oxd-button']
// ends-with ($) -> button[class$='login-button']
// only in case of Id attribute -> input[id='firstName'] -> input#firstName
// only in case of Class attribute -> input[class='button'] -> input.button