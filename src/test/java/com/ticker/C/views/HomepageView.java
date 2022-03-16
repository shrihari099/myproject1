package com.ticker.C.views;

import com.ticker.B.pages.HomePage;

public class HomepageView {
		public void navigate() throws InterruptedException {
	HomePage obj = new HomePage();
	obj.Dropdown();
	obj.StockScreener();
	Thread.sleep(5000);
	obj.Blocker();
	//changeed code

}
}
