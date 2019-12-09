package com.capgemini.seleniumpract.webDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
	}
	public static void main(String args[]) {
		//open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.HOURS);
		//enter the url
		driver.get("https://www.gmail.com/");
		//enter the userName
		driver.findElement(By.id("identifierId")).sendKeys("ashanonymous1@gmail.com");
		//click on next
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//enter the valid password
		driver.findElement(By.name("password")).sendKeys("7066705430");
		//click on login
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//display msg
//		String wh= driver.getWindowHandle();
//		System.out.println(wh);
		//click for verification
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		//click to Compose
		driver.findElement(By.xpath("//span[text()='Compose']")).click();
//		Set<String> whs1 = driver.getWindowHandles();
//		System.out.println("number of windows :" +whs1.size());
//		System.out.println(whs1);
		driver.findElement(By.name("Recipients")).sendKeys("pournimafulwade@gmail.com");
		
		

}
}//end of the class
