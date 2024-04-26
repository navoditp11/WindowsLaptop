package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver {

	public static void main(String[] args) {
		
		//1. load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2. retrieve bean from spring container
		
		//3. call methods on the bean
		
		//4. close the context

	}

}
