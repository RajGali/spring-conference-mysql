package com.example.conference.service;

import java.util.List;

import com.example.conference.model.Registration;
import com.example.conference.model.RegistrationReport;

public interface RegistrationService {

	Registration save(Registration registration);
	List<Registration> findAll();
	List<RegistrationReport> findAllReports();
}

