package com.virtusa.medplus.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Doctors  {
public AndroidDriver driver;
By ClickOnDoctos=AppiumBy.xpath("//android.view.View[@content-desc=\"Doctors Doctors New\"]");
	public Doctors(AndroidDriver driver) {
		this.driver=driver;
		
	}
public void DoctorClick() {
	driver.findElement(ClickOnDoctos).click();
}
}
