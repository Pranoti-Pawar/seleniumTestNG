package com.pranoti.selenium;

import org.testng.annotations.Test;

public class testAlwaysRun {
	@Test
	public void testcase() {
		System.out.println("login ");
		throw new RuntimeException("login failed");
		
	}
	@Test(dependsOnMethods="testcase",alwaysRun=true)
	public void testcase2()
	{
		System.out.println("test case 2");
	}
	

}
