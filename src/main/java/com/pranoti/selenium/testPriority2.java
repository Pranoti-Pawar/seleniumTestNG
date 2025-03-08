package com.pranoti.selenium;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testPriority2{
	
	@Test(priority = 1)
	@Parameters({"username","password"})
	public void TestCase(String un , String pwd) {
		System.out.println("Testcase one");
		System.out.println(un);
		System.out.println(pwd);
	}
	@Test(priority=0)
	public void TestCase2()
	{
		System.out.println("test case Two");
	}
	
}