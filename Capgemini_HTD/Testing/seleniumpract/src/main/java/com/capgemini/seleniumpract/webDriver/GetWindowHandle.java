package com.capgemini.seleniumpract.webDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	static {
		System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
	}
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		driver.get("https://www.naukari.com/");
		Set<String> whs = driver.getWindowHandles();
		System.out.println("number of windows :" +whs.size());
		System.out.println(whs);
		driver.quit();
	}

}
