package com.pranoti.selenium;

import org.testng.annotations.Test;

public class groupsDemo {
	
	@Test
	public void testOne()
	{
		System.out.println("first test case");
	}
	@Test
	public void testTwo()
	{
		System.out.println("test case two");
	}

	@Test(groups= {"smoke"})
	public void testThree()
	{
		System.out.println("test case three");
	}

	
	
	

}
