package com.gl.model;

public class Engine {
	private int engineID;
	private String engineMfgName;
	private int engineCapacity;
	private int engineCC;
	public Engine(int engineID, String engineMfgName, int engineCapacity, int engineCC) {
		super();
		this.engineID = engineID;
		this.engineMfgName = engineMfgName;
		this.engineCapacity = engineCapacity;
		this.engineCC = engineCC;
	}
	public Engine() {
		super();
	}
	public int getEngineID() {
		return engineID;
	}
	public void setEngineID(int engineID) {
		this.engineID = engineID;
	}
	public String getEngineMfgName() {
		return engineMfgName;
	}
	public void setEngineMfgName(String engineMfgName) {
		this.engineMfgName = engineMfgName;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	@Override
	public String toString() {
		return "Engine [engineID=" + engineID + ", engineMfgName=" + engineMfgName + ", engineCapacity="
				+ engineCapacity + ", engineCC=" + engineCC + "]";
	}
	

}
