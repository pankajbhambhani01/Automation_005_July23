package com.testcases.testngtest;

import com.pages.orangehrm.HomePage;
import com.utility.Browser;
import com.utility.Constant_1;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class LoginTestCases {
    @Test(description = "This test cases validate the negative case on orange hrms")
    public void ztestCase001(){
       System.out.println("I am in Testcase 1");
    }

    @Test(priority = 1)
    public void atestCase002(){
        System.out.println("I am in Testcase 2");
    }

    @Test(testName = "This test cases deals with the login of Oragen hrms ", priority = 1)
    public void testCase003(){
        System.out.println("I am in Testcase 3");
        Reporter.log("I am in Testcase 3");
    }

    @Test(enabled = false)
    public void testCase004(){
        System.out.println(" I am in testcase 4");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("running before suite");
        Reporter.log("running before suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("running before class");
        Reporter.log("running before class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("running before test");
        Reporter.log("running before test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("running before method");
        Reporter.log("running before method");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("running after suite");
        Reporter.log("running after suite");
    }
}

// by default it runs in alphabetical order
// by default all methods have priority as 0
// if 2 methods has same priority then it follows the alphabetical order
// by default all the @test methods are enabled
// @BeforeSuit > @BeforeTest > BeforeClass > @Before Method -- @AfterMethod > AfterClass > AfterTest > AfterSuit