package com.virtusa.medplus.TestScript;

import org.testng.annotations.Test;

import com.virtusa.medplus.pages.FactoryOutlet;

public class TC_FactoryOutlet extends BaseClass{
	@Test
	public void FactoryOutleData() throws InterruptedException {
		SelectingLocation();
		FactoryOutlet FO=new FactoryOutlet(driver);
		waitTimer();
		FO.ClickOnFactory();
		waitTimer();
		FO.exploreContent();
		
	}

}
