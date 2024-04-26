package com.greatlearning.driver;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceImpl.HindiTeacher;

public class Main {

	public static void main(String[] args) {
		
		Teacher teacher = new HindiTeacher();
		
		System.out.println(teacher.getHomework());

	}

}
