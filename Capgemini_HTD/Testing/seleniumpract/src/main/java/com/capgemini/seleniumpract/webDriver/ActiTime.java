package com.capgemini.seleniumpract.webDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTime {
	
	static {
		System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
	}
	@Test
	 public void testOne() throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//enter the url
		driver.get("http://demo.actitime.com/");
		//enter the userName
		driver.findElement(By.id("username")).sendKeys("admin");
		//enter the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		
		Thread.sleep(5000);
		
		String expected = "actiTIME - Enter Time-Track";
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		driver.close();
		
	}

}
