package com.jpaApp.jpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpaApp.jpahibernate.course.jpa.CourseJPARepository;
import com.jpaApp.jpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;


@Component
public class CourseCommandLineRunnerSpringDataJpa implements CommandLineRunner{
	
	private CourseSpringDataJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"Learn AWS","in28 minutes"));
		repository.save(new Course(2,"Learn Java","in28 minutes"));
		repository.save(new Course(3,"Learn C#","in28 minutes"));
		
		repository.deleteById(1l);
		
		System.out.print(repository.findById(2l));
	}

}
