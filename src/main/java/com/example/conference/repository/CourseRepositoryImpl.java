package com.example.conference.repository;

import org.springframework.stereotype.Repository;

import com.example.conference.model.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CourseRepositoryImpl implements CourseRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Course save(Course course) {
		entityManager.persist(course);
		return course;
		
	}

}
