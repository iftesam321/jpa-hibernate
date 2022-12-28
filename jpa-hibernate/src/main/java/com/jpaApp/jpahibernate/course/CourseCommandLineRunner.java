package com.jpaApp.jpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpaApp.jpahibernate.course.Course;
import com.jpaApp.jpahibernate.course.jdbc.CourseJdbcRepository;
import com.jpaApp.jpahibernate.course.jpa.CourseJPARepository;
import com.jpaApp.jpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJPARepository repository;


	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"Learn AWS","in28 minutes"));
		repository.insert(new Course(2,"Learn Java","in28 minutes"));
		repository.insert(new Course(3,"Learn C#","in28 minutes"));
		
		repository.deleteByID(1);
		
		System.out.print(repository.findById(3));
	}
	
	

}
