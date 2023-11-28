package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPage {

    private WebDriver driver;

    @FindBy(name = "user-name") private WebElement txt_username;

    @FindBy(name = "password") private WebElement txt_password;

    @FindBy(id = "login-button") private WebElement btn_login;

    @FindBy(xpath = "/html/body/div[1]") private WebElement login_logo;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/h3/button/svg/path") private WebElement path_fill;

    @FindBy(xpath = "/html/body/div[2]/div[1]/img") private WebElement login_bot;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password) {
        txt_password.sendKeys(password);

    }
    public void clickLogin() {
        btn_login.click();
    }

}



