package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

@Listeners (com.MyTests.ForListners.class)
public class D07ListnersDemo {
	@Test
	public void testCase1() {
		Assert.assertTrue(true);
	}
	@Test
	public void testCase2() {
		Assert.assertTrue(false);
	}
	@Test
	public void testCase3() {
		throw new SkipException("Skipping this test");
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
