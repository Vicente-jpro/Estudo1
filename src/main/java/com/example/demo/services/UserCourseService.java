package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domains.UserCourse;
import com.example.demo.repositories.UserCourseRepository;

@Service
@Transactional
public class UserCourseService {
	private final UserCourseRepository userCourseRepository;
	
	@Autowired
	public UserCourseService(UserCourseRepository userCourseRepository) {
		this.userCourseRepository = userCourseRepository;
	}
	
	public UserCourse create( UserCourse userCourse) {
		return this.userCourseRepository.save(userCourse);
	}
	
	public List<UserCourse> getUserCoures(){
		return this.userCourseRepository.findAll();
	}
	
}
