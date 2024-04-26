package com.gl.model;

public class Car {
	private int carID;
	private String modelName;
	private String mfgName;
	double price;
	Engine myEngine;
	Gear myGear;
	public Car() {
		super();
	}
	public Car(int carID, String modelName, String mfgName, double price, Engine myEngine, Gear myGear) {
		super();
		this.carID = carID;
		this.modelName = modelName;
		this.mfgName = mfgName;
		this.price = price;
		this.myEngine = myEngine;
		this.myGear = myGear;
	}
	public int getCarID() {
		return carID;
	}
	public String getModelName() {
		return modelName;
	}
	public String getMfgName() {
		return mfgName;
	}
	public double getPrice() {
		return price;
	}
	public Engine getMyEngine() {
		return myEngine;
	}
	public Gear getMyGear() {
		return myGear;
	}
	@Override
	public String toString() {
		return "Car [carID=" + carID + ", modelName=" + modelName + ", mfgName=" + mfgName + ", price=" + price
				+ ", myEngine=" + myEngine + ", myGear=" + myGear + "]";
	}

}
