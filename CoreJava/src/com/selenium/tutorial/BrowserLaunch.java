package com.selenium.tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException 
	{
		
//		BaseTest.launcher("chrome");
//		
//		BaseTest.navigateUrl("https://www.amazon.in/");
//		
//		BaseTest.launcher("firefox");
//		
//		BaseTest.navigateUrl("https://www.amazon.in/");
		//first approach
		
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
//driver.get("https://www.amazon.in/");

driver.navigate().to("https://www.amazon.in/");;



WebDriverManager.firefoxdriver().setup();
FirefoxDriver driver1 = new FirefoxDriver();
//driver.get("https://www.amazon.in/");

driver1.navigate().to("https://www.amazon.in/");;

driver.close();
driver1.close();
		
////Second approach	
//		
//		WebDriver driver; //since Webdriver is an interface so we can use its reference to hold the implementation class
//		
//		WebDriverManager.chromedriver().setup();
//	 driver = new ChromeDriver();
//		//driver.get("https://www.amazon.in/");
//
//		driver.navigate().to("https://www.amazon.in/");;
//
//		driver.close();
//
//		WebDriverManager.firefoxdriver().setup();
//		 driver = new FirefoxDriver();
//		//driver.get("https://www.amazon.in/");
//
//		driver.navigate().to("https://www.amazon.in/");;
//
//		driver.close();
//			
		
		
		
	}

	
}
