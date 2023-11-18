package com.testcases.swaglab;

import com.utility.Browser;
import com.utility.Constant;

public class TestCase1 {

    public static void main(String[] args) throws Exception {
        Browser br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl(Constant.url);
        Thread.sleep(5000);

    }
}

