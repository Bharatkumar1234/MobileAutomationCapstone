package com.virtusa.medplus.TestScript;

import org.testng.annotations.Test;

import com.virtusa.medplus.pages.SearchingMedicine;

public class TC_SearchMedicine extends BaseClass{
	@Test
	public void MedSerach() throws InterruptedException {
		SelectingLocation();
		SearchingMedicine SM=new SearchingMedicine(driver);
		waitTimer();
		SM.PharmacyClick();
		Thread.sleep(3000);
		SM.ClickInput();
		waitTimer();
		SM.EnterTheMedicineI("DOLO 650");
		waitTimer();
		SM.AddMedicine();
		
	}

	

}
