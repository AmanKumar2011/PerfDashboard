package com.selenium.tutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIRCTC {

	public static void main(String[] args) throws InterruptedException 
	{
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Poonam\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("Apple");

//driver.findElement(By.xpath("/html/body/div[1]/div[2]")).click();
//driver.findElement(By.name("btnK")).click();
//driver.findElement(By.("gNO89b")).click();

//driver.findElement(By.className("gNO89b")).click();

driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();

driver.findElement(By.name("q")).clear();
driver.findElement(By.name("q")).sendKeys("IRCTC");
driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[1]/div[1]/div[2]/div[2]/button/div/span")).click();

//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/div/cite")).click();
driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div[1]/a/h3")).click();

//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Thread.sleep(20000);
//  /html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button
driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
driver.findElement(By.xpath("/html/body/div[5]/div[1]/img")).click();


driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]/a/i")).click();

driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[3]/p-sidebar/div/nav/div/label/button")).click(); //Click on Login

driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/app-login/p-dialog[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("k123_1");


driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/app-login/p-dialog[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("fm@WL232872");

driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div/div/div/div/div")).click(); //Click on LIC Logo


driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/app-login/p-dialog[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/span/button")).click(); //Click on Sign In button

driver.close();



//  /html/body/div[7]/div/div[10]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/div/cite

//WebElement wb= driver.findElement(By.name("btnK"));
//wb.click();
//wb.click();
System.out.println("Program ran successfully");
	}

}
