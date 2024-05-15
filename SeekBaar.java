package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class SeekBaar extends BaseDemo
{
	@Test
	public void seekbar() throws InterruptedException
	{
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"));")).click();
		Thread.sleep(5000);
		
		WebElement slider=driver.findElement(By.id("io.appium.android.apis:id/seek"));
		Thread.sleep(5000);
		
		seekBarDemo(slider);
//		int xAxisStartPoint=slider.getLocation().getX();
//		int xAxisEndPoint=xAxisStartPoint+slider.getSize().getWidth();
//		int yAxisStartPoint=slider.getLocation().getY();
//		TouchAction action=new TouchAction(driver);
//		action.press(PointOption.point(xAxisStartPoint, yAxisStartPoint))
//		.moveTo(PointOption.point(xAxisEndPoint-100,yAxisStartPoint))
//		.release()
//		.perform();

/*
		int startX = seekBar.getLocation().getX();
        System.out.println(startX);
      
       //Get vertical location of seekbar.
        int startY = seekBar.getLocation().getY();
        System.out.println(startY);
      
        //Get end point of seekbar.
        int endX = seekBar.getSize().getWidth();
        System.out.println(endX);
      
      
        //Set seekbar move to position.
        //endX * 0.6 means at 60% of seek bar width.
       //endX * 0.9 means at 100% of seek bar width.
        int moveToXDirectionAt = (int) (endX * 0.9);
        System.out.println("Moving seek bar at " + moveToXDirectionAt+" In X direction.");
      
        //Moving seekbar using TouchAction class.
        TouchAction act=new TouchAction(driver);
        act.press(PointOption.point(startX,startY)).moveTo(PointOption.point(moveToXDirectionAt,startY)).release().perform();
*/
	}
	
	}
