package com.pranoti.selenium;

import org.testng.annotations.Test;

public class groupsDemo2 {
	@Test(groups= {"smoke"})
	public void testSeven()
	{
		System.out.println("test case seven");
	}

	@Test(groups= {"smoke","regression"})
	public void testEight()
	{
		System.out.println("test case eight");
	}


}
