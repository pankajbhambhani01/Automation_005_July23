package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "user-name") private WebElement txt_username;

    @FindBy(name = "password") private WebElement txt_password;

    @FindBy(id = "login-button") private WebElement btn_login;

    @FindBy(className = "login_logo")private WebElement logo;

    @FindBy(className = "error-button") private WebElement error_btn;

    @FindBy(className = "bot_column") private WebElement login_bot;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, 90);
    }

    public void enterUsername(String username) {
        wait.until(ExpectedConditions.visibilityOf(txt_username)).sendKeys(username);
        Reporter.log("Entered the username " + username);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(txt_password)).sendKeys(password);
        Reporter.log("Entered the password " + password);

    }
    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(btn_login)).click();
        Reporter.log("Login button clicked");
    }

    public void validateSwagLabsLogo(){
        wait.until(ExpectedConditions.visibilityOf(logo)).isDisplayed();
        boolean Displayed = logo.isDisplayed();
        Assert.assertTrue(Displayed);
        Reporter.log("logo is Displayed");
    }
    public void validateerrorbtn(){
        wait.until(ExpectedConditions.visibilityOf(error_btn)).isDisplayed();
        boolean Displayed =error_btn.isDisplayed();
        Assert.assertTrue(Displayed);
        Reporter.log("error_btn Displayed");
    }
    public void validateloginbot(){
        wait.until(ExpectedConditions.visibilityOf(login_bot)).isDisplayed();
        boolean Displayed = login_bot.isDisplayed();
        Assert.assertTrue(Displayed);
        Reporter.log("login_bot Displayed");
    }

}

