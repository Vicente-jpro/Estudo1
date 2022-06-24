package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domains.UserCourse;
import com.example.demo.services.UserCourseService;

@RestController
@RequestMapping("/usercourse")
public class UserCourseController {
	private final UserCourseService userCourseService;
	
	@Autowired
	public UserCourseController(UserCourseService userCourseService) {
		this.userCourseService = userCourseService;
	}
	
	@PostMapping( value = "/", produces = "application/json")
	public ResponseEntity<UserCourse> create(@RequestBody UserCourse userCourse){
		return new ResponseEntity<UserCourse>(userCourseService.create(userCourse), HttpStatus.CREATED);
	} 
	
	@GetMapping( value = "/all", produces = "application/json")
	public ResponseEntity<List<UserCourse>> getUsersAndCourses(){
		return new ResponseEntity<List<UserCourse>>(this.userCourseService.getUserCoures(), HttpStatus.OK);
	}
}
