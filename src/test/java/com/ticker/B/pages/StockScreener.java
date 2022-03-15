package com.ticker.B.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ticker.A.common.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StockScreener {
	private By ComapanyName = By.
			xpath("//span[contains(text(),'Infosys Ltd')]");
	private By MarketCap = By.
			xpath("//*[@id=\"screener-table\"]/section[2]/div[5]/span[8]");
			//xpath("//span[text()='7,63,687.44' and @class='jsx-3425801674 data-cell screener-cell desktop--only']");

	BaseClass obj=new BaseClass();

	public String getMarketName(){
		return obj.getDriver().findElement(ComapanyName).getText();
	}
	public String getMarketCap() {
		return obj.getDriver().findElement(MarketCap).getText();
	}

}



