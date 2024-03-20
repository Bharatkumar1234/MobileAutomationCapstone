package com.virtusa.medplus.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SearchingMedicine {
public AndroidDriver driver;
By ClickOnPharmacy=AppiumBy.xpath("//android.view.View[@content-desc=\"Pharmacy Pharmacy\"]");
By ClickInputBox=AppiumBy.xpath("(//android.view.View)[13]");
By EnterMedicine=AppiumBy.xpath("//android.widget.EditText");
By Add=AppiumBy.xpath("(//android.widget.Button)[1]");
public SearchingMedicine(AndroidDriver driver) {
	this.driver=driver;


	
}
	public void PharmacyClick() {
		driver.findElement(ClickOnPharmacy).click();
		
	}
public void ClickInput() {
	driver.findElement(ClickInputBox).click();
}
public void EnterTheMedicineI(String Medicine) {
	driver.findElement(EnterMedicine).sendKeys(Medicine);
	
}
public void AddMedicine() {
	driver.findElement(Add).click();
}


}
