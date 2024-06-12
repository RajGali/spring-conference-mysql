package com.example.conference.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.conference.model.Registration;
import com.example.conference.model.RegistrationReport;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Registration save(Registration registration) {
		entityManager.persist(registration);
		return registration;
	}
	
	@Override
	public List<Registration> findAll(){
		List<Registration> registrations = entityManager.createQuery("Select r from Registration r").getResultList();
		return registrations;
	}

	@Override
	public List<RegistrationReport> findAllReports() {
		String jpql = "Select new com.example.conference.model.RegistrationReport(r.registrationname, c.name, c.description) " + 
						"from Registration r, Course c " +
						"where r.id = c.registration.id";
		//com/example/conference/model/RegistrationReport.java
		
		List<RegistrationReport> registrationReports = entityManager.createQuery(jpql).getResultList();
		return registrationReports;
	}
	

}
