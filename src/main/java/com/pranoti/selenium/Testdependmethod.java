package com.pranoti.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testdependmethod {
	@Test
	public void login() {
		System.out.println("login...");
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods="login")
	public void search() {
		System.out.println("search...");
		
	}
	@Test(dependsOnMethods={"login","search"})
	public void order() {
		System.out.println("order..");
		
	}
	@Test(dependsOnMethods={"login","search","order"})
	public void payment() {
		System.out.println("payment done..");
		
	}
	
}
