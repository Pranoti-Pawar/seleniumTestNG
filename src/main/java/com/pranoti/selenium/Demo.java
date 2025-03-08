package com.pranoti.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

		//driver.findElement(By.name("first_name"));
		
		WebElement ele=Utilities.findelementwithretries(driver, "#contact_form > input:nth-child(1)", 2);
		ele.sendKeys("Pranoti");
		//Utilities.enterstring(driver, "#contact_form > input:nth-child(1)", "Pranoti");
		
		WebElement ele2=Utilities.findelementwithretries(driver,"#contact_form > input:nth-child(2)", 2);
		ele2.sendKeys("Pawar");
		//Utilities.enterstring(driver,"#contact_form > input:nth-child(2)", "Pawar");
		
		
		Utilities.findelementwithretries(driver,"#contact_form > input:nth-child(3)", 2);
		Utilities.enterstring(driver,"#contact_form > input:nth-child(3)", "pranotipatilgmail.com");
		

		Utilities.findelementwithretries(driver,"#contact_form > textarea", 2);
		Utilities.enterstring(driver,"#contact_form > textarea", "first comment");
		
		Utilities.elementisclickable(driver,"#form_buttons > input:nth-child(2)").click();
		
		
		

	}

}
