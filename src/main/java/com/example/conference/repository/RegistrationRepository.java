package com.example.conference.repository;

import java.util.List;

import com.example.conference.model.Registration;
import com.example.conference.model.RegistrationReport;

public interface RegistrationRepository {

	Registration save(Registration registration);

	List<Registration> findAll();

	List<RegistrationReport> findAllReports();

}