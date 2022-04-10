package com.ticker.pages;

import org.openqa.selenium.By;
import com.ticker.common.BaseClass;

public class StockScreener {
	private By ComapanyName = By.
			xpath("//span[contains(text(),'Infosys Ltd') and contains(@class,'desktop--only pointer')]");
	
	private By MarketCap = By.
			//xpath("//*[@id=\"screener-table\"]/section[2]/div[5]/span[8]");
			xpath("//span[@data-row='INFY' and contains(@class,'data-cell screener-cell desktop--only hovered')][1]");
			

	BaseClass obj=new BaseClass();

	public String getMarketName(){
		return obj.getDriver().findElement(ComapanyName).getText();
	}
	public String getMarketCap() {
		return obj.getDriver().findElement(MarketCap).getText();
	}

}



