package com.pranoti.selenium;

import org.testng.annotations.Test;

public class groupsDemo1 {
	@Test(groups= {"regression"})
	public void testFour()
	{
		System.out.println("test case four");
	}
	@Test
	public void testFive()
	{
		System.out.println("test case Five");
	}

	@Test
	public void testSix()
	{
		System.out.println("test case six");
	}



}
