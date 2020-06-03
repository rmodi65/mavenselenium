package com.webdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLogin {
	
	//@BeforeTest
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
		
	}
	@Test
	public void automationTest1()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://etrain.info/in");
		String check=driver.getTitle();
		System.out.println("Inside test 1");
		Assert.assertEquals(true, check.contains("Indian"));
		driver.close();
	}
	@Test
	public void automationTest2()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String check=driver.getTitle();
		System.out.println("Inside test 2");
		Assert.assertEquals(true, check.contains("Googl"));
		driver.close();

	}
	@Test
	public void automationTest3()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String check=driver.getTitle();
		System.out.println("Inside test 3");
		Assert.assertEquals(true, check.contains("Googl"));
		driver.close();

	}
	@Test
	public void automationTest4()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String check=driver.getTitle();
		System.out.println("Inside test 4");
		Assert.assertEquals(true, check.contains("Googl"));
		driver.close();

	}
	@Test
	public void automationTest5()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String check=driver.getTitle();
		System.out.println("Inside test 5");
		Assert.assertEquals(true, check.contains("Googl"));
		driver.close();

	}
	@Test
	public void automationTest6()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String check=driver.getTitle();
		System.out.println("Inside test 6");
		Assert.assertEquals(true, check.contains("Googl"));
		driver.close();

	}
 
}
