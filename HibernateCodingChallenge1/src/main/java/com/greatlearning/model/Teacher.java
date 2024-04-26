package com.greatlearning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TeacherTable")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Teacher_Id")
	private int id;
	
	@Column(name = "First_Name", length = 20)
	private String f_Name;
	@Column(name = "Last_Name", length = 20)
	private String l_Name;
	@Column(name = "Email")
	private String email;
	
	public Teacher() {
		super();
	}

	public Teacher(int id, String f_Name, String l_Name, String email) {
		super();
		this.id = id;
		this.f_Name = f_Name;
		this.l_Name = l_Name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getF_Name() {
		return f_Name;
	}

	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}

	public String getL_Name() {
		return l_Name;
	}

	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", f_Name=" + f_Name + ", l_Name=" + l_Name + ", email=" + email + "]";
	}
	
	

}
