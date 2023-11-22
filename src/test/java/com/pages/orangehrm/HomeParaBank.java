package com.pages.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

// Page object model -> POM -> selenium
// Project object model -> pom.xml -> maven
public class HomeParaBank {
    private WebDriver driver;

    public HomeParaBank(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys(username);
    }

    public void enterPassword(String password){
       // WebElement element = driver.findElement(By.name("password"));
        //element.sendKeys(password);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void clickLoginButton(){
        WebElement element = driver.findElement(By.xpath("//*[@value='Log In']"));
        element.click();
    }

    public void clickForgetLoginInfo(){
        WebElement element = driver.findElement(By.partialLinkText("Forgot login "));
        element.click();
    }

    public void clickRegister(){
        WebElement element = driver.findElement(By.partialLinkText("Register"));
        element.click();
    }

    public void validateUsernameLabel(String username){
        List<WebElement> elements = driver.findElements(By.xpath("//form//b"));
        String usernameLbl = elements.get(0).getText();
        Assert.assertEquals(usernameLbl, username);
    }

    public void validatePasswordLabel(String password){
        List<WebElement> elements = driver.findElements(By.xpath("//form//b"));
        String passwordLbl = elements.get(1).getText();
        Assert.assertEquals(passwordLbl, password);
    }
}
