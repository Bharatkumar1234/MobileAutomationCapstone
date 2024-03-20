package com.virtusa.medplus.TestScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import com.virtusa.medplus.TestScript.TC_Search_Loaction;
import com.virtusa.medplus.pages.SearchingMedicine;
import com.virtusa.medplus.pages.SettingLocation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public AndroidDriver driver;
	TC_Search_Loaction SLS;
	SearchingMedicine SMS;
@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("platformName", "Android");
	cap.setCapability("deviceName", "Medium Phone API 33");
	cap.setCapability("app", "C:\\Users\\bhara\\eclipse-workspace\\MedPlusHealthAutomation\\ApkSource\\MedPlus.apk");
//	cap.setCapability("appPackage", "com.medplus.mobile.android");
//	cap.setCapability("appPackaging", "com.medplus.mobile.android.MainActivity");
	cap.setCapability("automationName", "UiAutomator2");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),cap);
		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		waitTimer();
		
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
	}
public void SelectingLocation() throws InterruptedException {

	SettingLocation SL=new SettingLocation(driver);

	SL.EnterLoaction("Navalur");
	Thread.sleep(6000);
	SL.ClickonLoc();
	}

public void waitTimer() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

}
