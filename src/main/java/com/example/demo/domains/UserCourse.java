package com.example.demo.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "user_courses")
public class UserCourse {
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn( name = "course_id")
	private Course course;
	
	@ManyToOne
	@JoinColumn( name = "user_id")
	private User user;
	
}
