package com.selenium.tutorial;

import java.io.IOException;

import org.apache.commons.exec.launcher.CommandLauncher;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		init();
//		String url1=p.getProperty("amazonurl");
//		
//		String browser1= p.getProperty("chromebrowser");
//		System.out.println(browser1);
//		System.out.println(url1);
//		
//		launcher(browser1);
//		navigateUrl(url1);
		
		launcher("chromebrowser");
		navigateUrl("amazonurl");
		
		
		launcher("firefoxbrowser");
		navigateUrl("bestbuyurl");
		
		

	}

}
