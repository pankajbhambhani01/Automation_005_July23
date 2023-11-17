package com.testcases.orangehrm;

import com.pages.orangehrm.HomePage;
import com.utility.Browser;
import com.utility.Constant_1;

public class TestCase_6 {

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
