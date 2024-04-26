package com.np;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MisceallanousAppiumActions extends BaseTest {

	@Test
	public void Misceallanous() throws MalformedURLException, URISyntaxException {
		
		//adb shell dumpsys window | find "mCurrentFocus"
		//App Package & App Activity		
		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of("intent","io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));

		driver.findElement(By.id("android:id/checkbox")).click();
		
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);
		
		driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
		
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		
		//copy paste
		//copy to clipboard - paste it clipboard
		driver.setClipboardText("Navodit Wifi");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
	}

}
