package com.Assignment;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.Service;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.ServerArgument;
import io.appium.java_client.touch.offset.PointOption;

public class BaseDemo 
{
public AppiumDriver driver;
	AppiumDriverLocalService service;
	@BeforeMethod
	
	public void beforemethod() throws MalformedURLException, InterruptedException {
		
		service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\91769\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").withTimeout(Duration.ofSeconds(60)).usingPort(4723).build();
		         service.start();
	UiAutomator2Options options=new UiAutomator2Options();
	
	options.setDeviceName("Hemal");
	
	options.setApp("D:\\apk\\ApiDemos-debug.apk");
	//options.setApp("D:\\apk\\facebook_lite_v321.0.0.13.113.apk");
	//options.setApp("D:\\apk\\General-Store.apk");
    //options.setApp("D:\\apk\\instagram-254-0-0-19-109.apk");
	driver=new AppiumDriver(new URL("http://127.0.0.1:4723/"),options);
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Thread.sleep(6000);
	
	}
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}

	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.15
			));	
	}
	public void dragNDrop(WebElement source) {
	((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) source).getId(),
		    "endX", 619,
		    "endY", 560
		));
	}
	public void seekBarDemo(WebElement slider) {
		int xAxisStartPoint=slider.getLocation().getX();
		int xAxisEndPoint=xAxisStartPoint+slider.getSize().getWidth();
		int yAxisStartPoint=slider.getLocation().getY();
		TouchAction action=new TouchAction((PerformsTouchActions) driver);
		action.press(PointOption.point(xAxisStartPoint, yAxisStartPoint))
		.moveTo(PointOption.point(xAxisEndPoint-100,yAxisStartPoint))
		.release()
		.perform();
	}
	
	@AfterMethod
	public void aftermethod()
	{
		driver.quit();
		service.stop();
	}
}
