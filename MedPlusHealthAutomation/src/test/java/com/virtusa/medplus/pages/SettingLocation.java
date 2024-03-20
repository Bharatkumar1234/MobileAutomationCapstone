package com.virtusa.medplus.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SettingLocation {

	public AndroidDriver driver;
	By SetLocation=AppiumBy.xpath("//android.widget.EditText");
	By ClickTheLocation=AppiumBy.xpath("//android.view.View[@content-desc=\"Navalur Navalur, Tamil Nadu, India\"]");

	public SettingLocation(AndroidDriver driver) {
		this.driver=driver;


	}
	 
	public void EnterLoaction(String location) {
		driver.findElement(SetLocation).sendKeys(location);
	}
	public void ClickonLoc() {
		driver.findElement(ClickTheLocation).click();
		
	}

}
