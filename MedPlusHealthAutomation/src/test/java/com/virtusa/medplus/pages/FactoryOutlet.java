package com.virtusa.medplus.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class FactoryOutlet {
By Factory=AppiumBy.xpath("//android.view.View[@content-desc=\"Factory Direct Factory DirectNew\"]");
By startExplore=AppiumBy.xpath("//android.widget.Button[@text=\"Start Exploring\"]");
public AndroidDriver driver;
public FactoryOutlet(AndroidDriver driver) {
	this.driver=driver;
	
}
public void ClickOnFactory() {
	driver.findElement(Factory).click();
}
public void exploreContent() {
	driver.findElement(startExplore).click();
}

}
