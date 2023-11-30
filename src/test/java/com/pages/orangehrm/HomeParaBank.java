package com.pages.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

// Page object model -> POM -> selenium
// Page factory
// Project object model -> pom.xml -> maven
public class HomeParaBank {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "username")
    private WebElement txt_username;

    @FindBy(name = "password")
    private WebElement txt_password;

    @FindBy(xpath = "//*[@value='Log In']")
    private WebElement btn_login;

    @FindBy(partialLinkText = "Forgot login ")
    private WebElement lnk_forgotlogin;

    @FindBy(xpath = "//form//b")
    private List<WebElement> lbl_labels;

    public HomeParaBank(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 90);
    }

    public void enterUsername(String username){
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(txt_username));
        ele.sendKeys(username);
    }

    public void enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(txt_password)).sendKeys(password);
       // txt_password.sendKeys(password);
    }

    public void clickLoginButton(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btn_login));
        ele.click();
    }

    public void clickForgetLoginInfo(){
        lnk_forgotlogin.click();
    }

    public void clickRegister(){
        WebElement element = driver.findElement(By.partialLinkText("Register"));
        element.click();
    }

    public void validateUsernameLabel(String username){
        String usernameLbl = lbl_labels.get(0).getText();
        Assert.assertEquals(usernameLbl, username);
    }

    public void validatePasswordLabel(String password){
        String passwordLbl = lbl_labels.get(1).getText();
        Assert.assertEquals(passwordLbl, password);
    }
}
// button -> btn_nameofbutton
//input/textbox -> txt_
// link -> lnk_
//check -> chk_
// dropdown -> dd_
// lable -> lbl_