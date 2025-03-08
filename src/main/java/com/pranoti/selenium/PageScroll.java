package com.pranoti.selenium;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("http://www.google.com");
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("Software testing help");
		ele.sendKeys(Keys.ENTER);
		js.executeScript("window.scroll(10000,10000)","");
		
		
	}

}
