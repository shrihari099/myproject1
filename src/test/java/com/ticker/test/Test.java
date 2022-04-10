package com.ticker.test;
import com.ticker.common.BaseClass;
import com.ticker.views.HomepageView;
import com.ticker.views.StockScreenerView;

public class Test {
	
public static void main(String[] args)  {
	
	
	BaseClass obj=new BaseClass();
	obj.setDriver();
	obj.browser();
	
	HomepageView obj2=new HomepageView();
	obj2.navigate();
	
	StockScreenerView obj3=new StockScreenerView();
	obj3.Verify();
	
	
	
	
	
}
}
