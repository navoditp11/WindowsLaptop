package com.demo.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("C:\\Users\\pnavodit\\eclipse-workspace\\Selenium\\com.demo\\src\\test\\resources\\configure\\properties");
	Properties property = new Properties();
	property.load(fr);
	
	System.out.println(property.getProperty("browser"));
	System.out.println(property.getProperty("testurl"));
	
	}

	
}
