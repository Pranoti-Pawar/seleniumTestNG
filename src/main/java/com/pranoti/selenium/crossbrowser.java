package com.pranoti.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class crossbrowser {
//	WebDriver driver;
//	@BeforeMethod
//	@Parameters("browser")
//	public void setup(String browser)
//	{
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			
//		}
//		else if(browser.equalsIgnoreCase("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
//		else if(browser.equalsIgnoreCase("edge"))
//		{
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//		}
//		else {
//			throw new IllegalArgumentException("wrong broser"+browser);
//		}
//		driver.manage().window().maximize();
//		
//	}
//	@Test
//	public void testgoogle() {
//		driver.get("http://www.google.com");
//		
//		System.out.println("open website"+driver.getTitle());
//	}
//	
//
//	@AfterMethod
//	public void closee()
//	{
//		if(driver!=null)
//		{
//			driver.quit();
//			
//		}
//	}
//}

//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.annotations.*;

//public class CrossBrowserTest {
    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")  // Accepts browser name from testng.xml
    public void setup(@Optional("chrome") String browser) {  // Default browser is Chrome
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }
        driver.manage().window().maximize();
        System.out.println(browser);
    }

    @Test
    public void testGoogle() {
        driver.get("https://www.google.com");  // Fixed URL
        System.out.println("Website Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
        	
            driver.quit();
        }
    }
}
