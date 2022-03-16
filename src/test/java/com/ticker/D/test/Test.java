package com.ticker.D.test;
import com.ticker.A.common.BaseClass;
import com.ticker.C.views.HomepageView;
import com.ticker.C.views.StockScreenerView;

public class Test {
	
public static void main(String[] args) throws InterruptedException {
	
	
	BaseClass obj=new BaseClass();
	obj.setDriver();
	obj.browser();
	
	HomepageView obj2=new HomepageView();
	obj2.navigate();
	
	StockScreenerView obj3=new StockScreenerView();
	obj3.Verify();
	
	
	
}
}
