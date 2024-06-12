package com.example.conference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.conference.model.Course;
import com.example.conference.model.Registration;
import com.example.conference.model.RegistrationReport;
import com.example.conference.repository.CourseRepository;
import com.example.conference.repository.RegistrationRepository;

import jakarta.transaction.Transactional;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	@Transactional
	public Registration save(Registration registration) {
		
		registration= registrationRepository.save(registration);
		Course course = new Course();
		course.setName("Intro");
		course.setDescription("Every attendee must complete the Intro course");
		course.setRegistration(registration);
		courseRepository.save(course);	
		return registration;
		
	}

	@Override
	public List<Registration> findAll() {
		// TODO Auto-generated method stub
		return registrationRepository.findAll();
	}

	@Override
	public List<RegistrationReport> findAllReports() {
		// TODO Auto-generated method stub
		return registrationRepository.findAllReports();
	}

}
