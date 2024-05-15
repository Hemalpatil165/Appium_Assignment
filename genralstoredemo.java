package com.Assignment;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class genralstoredemo extends BaseDemo
{

	@Test
	public void scroll() throws InterruptedException
	{	
      //driver.findElement(By.id(""))
		
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hemal");
		Thread.sleep(2000);
		
		driver.findElement(By.id
			("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"));")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale\r\n")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop\r\n")).click();
		Thread.sleep(2000);

}
}
