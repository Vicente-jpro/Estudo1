package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domains.UserCourse;

public interface UserCourseRepository extends JpaRepository<UserCourse, Long>{

}
