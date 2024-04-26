package com.demo.testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.demo.base.LaunchBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Login extends LaunchBrowser {

	//public static void main(String[] args) throws IOException {
	//		WebDriverManager.chromedriver().setup();
	//
	//		WebDriver driver = new ChromeDriver();
	//
	//		driver.manage().window().maximize();
	
	@Test
	public static void Login() {
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("baker-test+e2eus10@amazon.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("test123");
		driver.findElement(By.id("signInSubmit")).click();
	}
	
	
	@Test
	public static void ScreenShot() throws IOException {
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Baby");

		WebElement element = driver.findElement(By.id("nav-cart-text-container"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("screenshot.png"));
	}


}
