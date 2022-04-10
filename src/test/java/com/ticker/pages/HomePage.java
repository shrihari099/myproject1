package com.ticker.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ticker.common.BaseClass;

public class HomePage {
	WebDriver driver;
	private By DropdownLocator = By.id("tt-vertical");
	private By stockscreenerlocator = By.
			xpath("//span[text()='Stock Screener' and contains(@class,'font-medium mt8 text-12')]");
	private By blockerl= By.xpath("//button[contains(@class,'small secondary button-root')]");
	BaseClass obj=new BaseClass();


	public void Dropdown() {
		obj.getDriver().findElement(DropdownLocator).click();
	}
	public  void StockScreener() {
		obj.getDriver().findElement(stockscreenerlocator).click();
	}
	public void Blocker() {
		obj.getDriver().findElement(blockerl).click();
	}

}