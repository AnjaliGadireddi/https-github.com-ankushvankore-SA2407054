package com.MyTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ForListners implements ITestListener {
	public void onStart(ITestContext result) {
		System.out.println("Test stated!!!");
	}

	public void onFinish(ITestContext result) {
		System.out.println("Test Finish");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " fail");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + " skipped");

	}

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " started execution");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " pass");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}
}
