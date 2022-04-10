/**
 * 
 */
package com.ticker.views;

import com.ticker.pages.StockScreener;


public class StockScreenerView {
	
	StockScreener obj2= new StockScreener();
	public void Verify() {
		
		String a=obj2.getMarketName();
		System.out.println(a);
		
		String b = obj2.getMarketCap();
		System.out.println(b);
	
		
	}

}


