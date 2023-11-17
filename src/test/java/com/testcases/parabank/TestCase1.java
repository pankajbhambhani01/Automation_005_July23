package com.testcases.parabank;

import com.pages.orangehrm.HomePage;
import com.utility.Browser;
import com.utility.Constant;
import com.utility.Constant_1;

public class TestCase1 {

    public static void main(String[] args) throws Exception {
        Browser br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl(Constant.url);
        Thread.sleep(5000);

    }
}

