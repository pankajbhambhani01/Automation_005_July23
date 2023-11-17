package com.testcases.orangehrm;

import com.utility.Browser;
import com.utility.Constant_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase_4 {
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
        element.sendKeys("Admin");
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
        element.sendKeys("admin123");
        String placeHolderPassword = element.getAttribute("placeholder");
        if(placeHolderPassword.equals("Password")){
            System.out.println("the testcase is pass");
        }else{
            System.out.println("the testcase is fail");
        }
        element = driver.findElement(By.tagName("button"));
        element.click();
    }
}
// xpath - it supports forward and backward
//tagName[@attribute='value']//parent::tagName -- e.g. above
//*[@name='password']//ancestor::div
//form/div[3]
////form/div[contains(@class,'form-row') and contains(.,'Password')]//following-sibling::div