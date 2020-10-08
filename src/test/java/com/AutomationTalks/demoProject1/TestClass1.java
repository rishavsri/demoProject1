package com.AutomationTalks.demoProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	WebDriver driver;
	
	@BeforeMethod
	public void launchDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32_new\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
	
	@Test
	public void Test1() throws InterruptedException
	{
		driver.navigate().to("http://www.google.co.in");
		//driver.manage().window().fullscreen();
		Thread.sleep(4000);
		//driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void Test2()
	{
		driver.navigate().to("http://www.google.co.in");
		driver.getTitle();
	}
	
	@Test
	public void Test3()
	{
		driver.navigate().to("http://www.google.co.in");
		driver.getTitle();
	}
	
	@AfterMethod
	public void quit()
	{
		driver.close();
	}
}
