package com.pranoti.selenium;

import org.testng.annotations.Test;

public class testPriority {
	@Test(priority=1)
	public void testA()
	{
		System.out.println(" A");
	}
	@Test(priority=0)
	public void testB()
	{
		System.out.println(" B");
	}
	@Test(priority=-1)
	public void testC()
	{
		System.out.println("C");
	}
}
