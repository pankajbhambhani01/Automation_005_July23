package com.testcases;

import com.utility.Browser;
import com.utility.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2 {

    public static void main(String[] args) throws Exception {
        //https://chromedriver.chromium.org/downloads
        Browser br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl(Constant.url);
        WebDriver driver = br.getDriver();
        Thread.sleep(5000);// 5 sec wait
        WebElement element;
        element = driver.findElement(By.name("username"));
        element.sendKeys(Constant.username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(Constant.password);
        element = driver.findElement(By.xpath("//*[contains(@class,'orangehrm-login-button')]"));
        element.click();
    }
}
// xpath -> absolute / relative
// absolute -> /html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input
// Relative -> //*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input
// / -> immidiate child
// // -> anywhere in the DOM
// //tagName[@attribute='value']
//tagName--- no need of attributes[]  -- //h2
// if tagName not known -> *
//click anywhere in inspector DOM -> ctrl+f
//input[@placeholder='Password']
//*[@placeholder='Password'] -> * for any tag
//--------------------------------------------
//*[@value='Log In' or @type='submit1']
//*[@value='Log In' and @type='submit1']
//-----------------------------------------------------
//tagName[function(@attribute,'value')]
//*[contains(@class,'orangehrm-login-button')]
//*[starts-with(@class,'oxd-button')]
//*[ends-with(@class,'train_Search)]
//li[text()='Solutions']  -- //*[text()=' Login '] -- //*[.=' Login ']
//p[contains(text(),'Forgot your password?')]  //p[contains(.,'Forgot your password?')]
//-------------------------------------------------------
//form//input[@name='username']
//form/input[@name='username']
