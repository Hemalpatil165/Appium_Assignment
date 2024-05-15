package com.Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Options;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class open
{
	public AndroidDriver driver;
	
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		
	UiAutomator2Options options=new UiAutomator2Options();
	
	options.setDeviceName("Hemal");
    options.setApp("D:\\apk\\ApiDemos-debug.apk");
//	options.setApp("D:\\apk\\facebook_lite_v321.0.0.13.113.apk");
//	options.setApp("D:\\apk\\facebook_lite_v321.0.0.13.113.apk");
	
//	options.setApp("D:\\apk\\instagram-254-0-0-19-109.apk");
	
	driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(3000);
	
	driver.quit();

	}
     
	}


