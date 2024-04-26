package com.np;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AssignmentLecture39 extends BaseTest {

	@Test
	public void AssignmentDemoTest() throws MalformedURLException, URISyntaxException, InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text=\"Traffic\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Repeat alarm")).click();
		String checkText = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(checkText, "Repeat alarm");
		
		
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.CheckedTextView)[7]")).getAttribute("checkable"),"true");
		driver.findElement(By.xpath("(//android.widget.CheckedTextView)[7]")).click();
		Thread.sleep(3000);

	}

}
