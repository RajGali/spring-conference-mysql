package com.example.conference.model;

public class Registration {
	
	private String registrationname;

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
