package com.selenium.tutorial;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	// WebDriver driver; //since Webdriver is an interface so we can use its reference to hold the implementation class. If 
	 //we make webdriver static and all the below methods static then it will be easier to call and we will 
	 //not have to create the object of the basetest
	  static  WebDriver driver;
	  public static String projectPath= System.getProperty("user.dir");
	  static String browser;
	 public static Properties p= new Properties();
	 
public static void init() throws IOException
{
	//to initialize the properties file.
	
	FileInputStream fis= new FileInputStream(projectPath+"\\data.properties");
//	Properties p= new Properties();
	p.load(fis);
	// browser= p.getProperty("chromebrowser");
	 
	// System.out.println(browser);
	//FileInputStream fis= new FileInputStream("C:\\Users\\Poonam\\Documents\\GitHub\\PerfDashboard\\PerfDashboard\\CoreJava\\data.properties");
	
}
	//public void launcher(String browser)  
	public static void launcher(String browser)
	{
		
		
		
		
	if(p.getProperty(browser).equals("chrome"))	
		
//	if(browser.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		// driver.navigate().to("https://www.amazon.in/");;
		 
	//	driver.get("https://www.amazon.in/");

		// driver.close();
	}
	
	if(p.getProperty(browser).equals("firefox"))	
		
	//if(browser.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		
	//	driver.navigate().to("https://www.amazon.in/");;

	//	driver.close();
	}
	
		
	}
	
	//public  void navigateUrl(String url) throws InterruptedException  
	public  static void navigateUrl(String url) throws InterruptedException
	{
		driver.get(p.getProperty(url));
	//	driver.get(url);
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
}
