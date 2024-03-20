package com.virtusa.medplus.TestScript;

import org.testng.annotations.Test;

import com.virtusa.medplus.pages.Diagnostics;

public class TC_Diagnostics extends BaseClass{
	@Test
	public void SetuDiagno() throws InterruptedException{
		SelectingLocation();
		Diagnostics diag=new Diagnostics(driver);
		waitTimer();
		Thread.sleep(7000);
		diag.ClickOnDiagnostics();
		waitTimer();
		String str=diag.OffersDiagno();
		System.out.println(str);
		
		
	}

}
