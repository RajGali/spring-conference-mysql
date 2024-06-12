package com.example.conference.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="REGISTRATION")
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String registrationname;
	@JsonManagedReference
	@OneToMany(mappedBy = "registration", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Course> courses = new ArrayList<>();
	

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(String registrationname) {
		super();
		this.registrationname = registrationname;
	}

	public String getRegistrationname() {
		return registrationname;
	}

	public void setRegistrationname(String registrationname) {
		this.registrationname = registrationname;
	}
	

	@Override
	public String toString() {
		return "Registration [registrationname=" + registrationname + "]";
	}
	

	

}
