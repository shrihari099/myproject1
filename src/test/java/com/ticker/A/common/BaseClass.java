package com.ticker.A.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ticker.B.pages.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
		public void setDriver()
		{	
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		//return this.driver;

		}
		public WebDriver getDriver()
		{
		return driver;
		}
		public void browser() {
		
		driver.get("https://www.tickertape.in/");
		
	}
}

