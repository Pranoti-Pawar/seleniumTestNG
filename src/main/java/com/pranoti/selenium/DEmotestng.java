package com.pranoti.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DEmotestng {
	@BeforeMethod
	
	public void befroreMethod()
	{
		System.out.println("Beforemethod");
	}
	@Test
	
	public void testMethod()
	{
		System.out.println("First Test Method");
	}
	@Test
	public void testTwoMethod()
	{
		System.out.println("second Test Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Aftermethod");
	}
	

}
