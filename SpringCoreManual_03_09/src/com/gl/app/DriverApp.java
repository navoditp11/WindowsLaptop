package com.gl.app;

import com.gl.model.Car;
import com.gl.model.Engine;
import com.gl.model.Gear;

public class DriverApp {

	public static void main(String[] args) {
		Engine e1 = new Engine(101,"Honda", 12,1500);
		Gear g1 = new Gear(201,"Prime Auto", "Automatic");
		
		Engine e2 = new Engine(102,"Honda Diesel", 12,1500);
		
		Car c1 = new Car(301, "Q3", "Audi", 1000,e2,g1);
		
		System.out.println(c1);

	}

}
