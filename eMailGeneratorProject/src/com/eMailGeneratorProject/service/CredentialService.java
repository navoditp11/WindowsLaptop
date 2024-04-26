package com.eMailGeneratorProject.service;

import com.eMailGeneratorProject.model.Employee;

public interface CredentialService {
	public String generateEmail(String firstName, String lastName, String department);
	
	public String generatePassword();
	
	public void displayCredential(Employee employee);

}
