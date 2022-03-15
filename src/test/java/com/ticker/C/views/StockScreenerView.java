/**
 * 
 */
package com.ticker.C.views;

import com.ticker.B.pages.StockScreener;


public class StockScreenerView {
	
	StockScreener obj2= new StockScreener();
	public void Verify() {
		
		String a = obj2.getMarketCap();
		String b = obj2.getMarketName();
		System.out.println(a);
		//float i=Float.parseFloat(b);
	}

}


