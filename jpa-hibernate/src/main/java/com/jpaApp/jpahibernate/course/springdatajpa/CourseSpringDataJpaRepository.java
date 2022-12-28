package com.jpaApp.jpahibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaApp.jpahibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

}
