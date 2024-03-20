package com.virtusa.medplus.TestScript;

import org.testng.annotations.Test;

import com.virtusa.medplus.pages.SettingLocation;

public class TC_Search_Loaction extends BaseClass{
	//To Search Near by store location
	@Test
	public void SelectingLocation() throws InterruptedException {

		SettingLocation SL=new SettingLocation(driver);
	//TO be refactor the Location 
		SL.EnterLoaction("Navalur");
		Thread.sleep(6000);
		SL.ClickonLoc();
		}

}
