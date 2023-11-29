package com.listners;

import com.utility.Constant;
import com.utility.Util;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Properties;

public class TestListners implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("======================================");
        System.out.println("Test case started " + iTestResult.getName());
        Properties td = Util.readProperties(iTestResult.getName());
        Constant.td = td;
    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
