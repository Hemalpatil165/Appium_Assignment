package com.Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class calculator 
{
		
		@Test
		public void opencal() throws InterruptedException, MalformedURLException 
		{
	  DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("deviceName", "Xiaomi Redmi Note 9 Pro");
	cap.setCapability("udid","f77cd0b5");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "12.0");
	cap.setCapability( "appPackage","com.miui.calculator");
	cap.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
	cap.setCapability("automationName", "UIAutomator2");

	 AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/"),cap);
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 Thread.sleep(2000);

			
		}

	}



