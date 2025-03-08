package com.pranoti.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utilities {
	public static WebElement findelementwithretries(WebDriver driver,String locator,int retry) throws InterruptedException {
		for(int i=0;i<retry;i++)
		{
			try {
			return driver.findElement(By.cssSelector(locator));
		}
			catch(Exception e)
			{
				Thread.sleep(2);
			}
	
		}
		throw new RuntimeException("element not found");
		
		
	}
	
	public static void enterstring(WebDriver driver,String locator,String text) throws InterruptedException {
		
		WebElement ele=findelementwithretries(driver,locator,2);
		ele.clear();
		ele.sendKeys(text);
		
	}
	
	public static WebElement elementisclickable(WebDriver driver,String locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
	}

}
