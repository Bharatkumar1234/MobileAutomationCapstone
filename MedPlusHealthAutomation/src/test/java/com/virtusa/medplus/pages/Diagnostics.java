package com.virtusa.medplus.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Diagnostics {
	public AndroidDriver driver;
	By Diagno=AppiumBy.xpath("//android.view.View[@content-desc=\"Diagnostics Diagnostics New\"]");
	By DiagnoOffers=AppiumBy.xpath("(//android.view.View)[7]");
	public Diagnostics(AndroidDriver driver) {
		this.driver=driver;
		
	}
	public void ClickOnDiagnostics() {
		driver.findElement(Diagno).click();
	}
	
public  String OffersDiagno() {
	return driver.findElement(Diagno).getText();
}
}
