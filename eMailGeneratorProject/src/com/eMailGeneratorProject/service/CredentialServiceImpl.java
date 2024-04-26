package com.eMailGeneratorProject.service;

import java.util.Random;

import com.eMailGeneratorProject.model.Employee;

public class CredentialServiceImpl implements CredentialService {
	
	String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&*_=+-/.?<>)(";

	@Override
	public String generateEmail(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".abc.com";
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String values = letters + letters.toLowerCase() + numbers + specialCharacters;
		
		Random random = new Random();
		char[] password = new char[8];
		for(int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return String.valueOf(password);
	}

	@Override
	public void displayCredential(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + ", your generated credentials are as follows");
		System.out.println("Email ---> " + employee.getEmail());
		System.out.println("Password ---> " + employee.getPassword());

	}

}
