package com.eMailGeneratorProject.main;

import java.util.Scanner;

import com.eMailGeneratorProject.model.Employee;
import com.eMailGeneratorProject.service.CredentialService;
import com.eMailGeneratorProject.service.CredentialServiceImpl;

public class emailCredentialGeneratorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Name: ");
		String firstName = sc.next();
		System.out.println("Enter the Last Name: ");
		String lastName = sc.next();
		
		Employee employee = new Employee(firstName, lastName);
		System.out.println("Please enter the Department Choice ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = sc.nextInt();

		String department = "";

		switch (option) {
		case 1:
			department = "tech";
			break;

		case 2:
			department = "admin";
			break;

		case 3:
			department = "hr";
			break;

		case 4:
			department = "legal";
			break;

		default:
			System.out.println("Enter a Valid option !");
			break;
		}

		CredentialService service = new CredentialServiceImpl();
		String generatedEmail = service.generateEmail(firstName, lastName, department);
		String generatedPassword = service.generatePassword();

		employee.setEmail(generatedEmail);
		employee.setPassword(generatedPassword);
		service.displayCredential(employee);
		sc.close();



	}

}
