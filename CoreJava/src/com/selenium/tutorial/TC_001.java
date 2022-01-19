package com.selenium.tutorial;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
//		BaseTest obj= new BaseTest();
//		
//		
//		obj.launcher("chrome"); // this is has a relationship
//		  //     launcher("chrome");// can access this way only if we extend it
//				
//				obj.navigateUrl("https://www.amazon.in/");
//				
//				obj.launcher("firefox");
//				
//				obj.navigateUrl("https://www.amazon.in/");
				
				
		
       BaseTest.launcher("chrome"); // this is has a relationship    we can access this way if the method launch and webdriver are static
  //     launcher("chrome");// can access this way only if we extend it
		
		BaseTest.navigateUrl("https://www.amazon.in/"); //  we can access this way if the method launch and webdriver are static
		
		BaseTest.launcher("firefox");
		
		BaseTest.navigateUrl("https://www.amazon.in/");

	}

}
