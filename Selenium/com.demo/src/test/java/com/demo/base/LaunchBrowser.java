package com.demo.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public static WebDriver driver;
	public static Properties property = new Properties();
	public static FileReader fr;
	
	@BeforeTest
	public static void setUp() throws IOException {
		if(driver == null) {
			FileReader fr = new FileReader("C:\\\\Users\\\\pnavodit\\\\eclipse-workspace\\\\Selenium\\\\com.demo\\\\src\\\\test\\\\resources\\\\configure\\\\properties");
			property.load(fr);
		} 
		
		if(property.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(property.getProperty("testurl"));
			driver.manage().window().maximize();
		}
		
		
	}
	
	@AfterTest
	public static void tearDown() {
		driver.close();
		
	}

}
