package com.testcases.orangehrm;

import com.pages.orangehrm.HomePage;
import com.pages.orangehrm.HomeParaBank;
import com.utility.Browser;
import com.utility.Constant_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase_9_parabank {


    public void testcase1() throws Exception{
        Browser br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl("https://para.testar.org/parabank/about.htm;jsessionid=FB240F858FA900BA96DEE5A980656F85");
        Thread.sleep(5000);
        WebDriver driver = br.getDriver();
        HomeParaBank homeParaBank = new HomeParaBank(driver);

        //WebElement usernameTxt = driver.findElement(By.name("username"));
        //usernameTxt.sendKeys("admin");
        homeParaBank.enterUsername("admin");
        //List<WebElement> elements = driver.findElements(By.xpath("//form//b"));
        //String usernameLbl = elements.get(0).getText();
        //String passwordLbl = elements.get(1).getText();
       // Assert.assertEquals(usernameLbl, "Username");
        //Assert.assertEquals(passwordLbl, "Password");
        homeParaBank.validateUsernameLabel("Username");
        homeParaBank.validatePasswordLabel("Password");

        //WebElement passowrdTxt = driver.findElement(By.name("password"));
        //passowrdTxt.sendKeys("admin");
        homeParaBank.enterPassword("admin");

        //WebElement loginBtn = driver.findElement(By.xpath("//*[@value='Log In']"));
        //loginBtn.click();
        homeParaBank.clickLoginButton();
    }

    public static void main(String[] args) throws Exception {
        Browser br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl(Constant_1.url);
        Thread.sleep(5000);
        HomePage homePage = new HomePage(br.getDriver());
        String label = homePage.getUsernameLabel();
        if (label.equals("Username")) {
            System.out.println("the testcase is pass");
        } else {
            System.out.println("the testcase is fail");
        }
        String placeholder = homePage.getUsernamePlaceHolder();
        if (placeholder.equals("Username")) {
            System.out.println("the testcase is pass");
        } else {
            System.out.println("the testcase is fail");
        }
        homePage.enterUsernameTxt(Constant_1.username);
        label = homePage.getPasswordLabel();
        if (label.equals("Username")) {
            System.out.println("the testcase is pass");
        } else {
            System.out.println("the testcase is fail");
        }
        placeholder = homePage.getPasswordPlaceHolder();
        if (placeholder.equals("Username")) {
            System.out.println("the testcase is pass");
        } else {
            System.out.println("the testcase is fail");
        }
        homePage.enterPasswordTxt(Constant_1.password);
        homePage.clickLoginbtn();
    }
}
// POM -> Selenium -> page object model
// POM -> maven -> Project Object Model
