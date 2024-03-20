package com.virtusa.medplus.TestScript;

import org.testng.annotations.Test;

import com.virtusa.medplus.pages.Doctors;

public class TC_Doctors extends BaseClass{
	@Test
	public void DoctorsSelect() throws InterruptedException {
	SelectingLocation();
	Doctors DC=new Doctors(driver);
	waitTimer();
	DC.DoctorClick();
	
	
	}

}
