package com.gl.indianbank.model;

public class Customer {
	private String bankAccountNo;
	private String password;
	
	public Customer() {
		super();
	}

	public Customer(String bankAccountNo, String password) {
		super();
		this.bankAccountNo = bankAccountNo;
		this.password = password;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
