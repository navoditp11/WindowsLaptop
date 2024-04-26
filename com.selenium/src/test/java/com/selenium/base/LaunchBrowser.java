package com.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.ChromeDriver().setup();
		
		

	}

}
