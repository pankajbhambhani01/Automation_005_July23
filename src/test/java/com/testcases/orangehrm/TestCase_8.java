package com.testcases.orangehrm;

import com.pages.orangehrm.HomePage;
import com.utility.Browser;
import com.utility.Constant_1;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase_8 {

    @Test
    @Parameters ({"username", "Password"})
    public void testCase001(String username, String password) throws Exception{
        Browser br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl(Constant_1.url);
        Thread.sleep(5000);
        HomePage homePage = new HomePage(br.getDriver());
        String label = homePage.getUsernameLabel();
        Assert.assertEquals(label, "Username");
        String placeholder = homePage.getUsernamePlaceHolder();
        Assert.assertEquals(placeholder, "Username");
        homePage.enterUsernameTxt(Constant_1.username);
        label = homePage.getPasswordLabel();
        Assert.assertEquals(label, "Password");
        placeholder = homePage.getPasswordPlaceHolder();
        Assert.assertEquals(placeholder, "Password");
        homePage.enterPasswordTxt(Constant_1.password);
        homePage.clickLoginbtn();
    }
}

// @Test -> it will automatically get run by testNg
// Assert.assertEquals (expected, actual)
// Report -> once it runs -> open the DD of configurations > edit configuration > listerns > check use default listners
