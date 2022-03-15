package com.ticker.B.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ticker.A.common.BaseClass;

public class HomePage {
	WebDriver driver;
	private By DropdownLocator = By.id("tt-vertical");
	private By stockscreenerlocator = By.
	xpath("//span[text()='Stock Screener' and @class='jsx-3274206467 font-medium mt8 text-12 text-center short-text lh-138']");
	private By blockerl= By.xpath("//button[contains(@class,'jsx-2438823841 jsx-2322683530 small secondary button-root')]");
	BaseClass obj=new BaseClass();
	
	
	public void Dropdown() {
		obj.getDriver().findElement(DropdownLocator).click();
		}
	public  void StockScreener() throws InterruptedException {
		obj.getDriver().findElement(stockscreenerlocator).click();
	}//Thread.sleep(5000);
		public void Blocker() {
		obj.getDriver().findElement(blockerl).click();
		}
	
}