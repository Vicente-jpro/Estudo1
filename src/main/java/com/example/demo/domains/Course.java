package com.example.demo.domains;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table( name = "courses")
public class Course {
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column( name = "course_name")
	private String name;
	
	@OneToMany( mappedBy = "course")
	private List<UserCourse> userCourse = new ArrayList<UserCourse>();
}