package com.pranoti.selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	@DataProvider(name="loginData")
	public Object[][] getData(){
		
		return new Object[][] {
			
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
			
		};
		
	}
	@Test(dataProvider="loginData")
	public void login(String un,String pwd)
	{
		System.out.println(un);
		System.out.println(pwd);
	}

}
