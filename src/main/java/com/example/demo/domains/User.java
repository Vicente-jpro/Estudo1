package com.example.demo.domains;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "users")
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String age;
//	
//	@JsonManagedReference
//	@ManyToMany( cascade = CascadeType.ALL)
//	@JoinTable(
//		name = "user_courses",
//		joinColumns ={ @JoinColumn( name = "user_id", referencedColumnName = "id") },
//		inverseJoinColumns = { @JoinColumn(name = "course_id", referencedColumnName = "id")}
//	)
	
	@OneToMany( mappedBy = "user")
	List<UserCourse> userCourses = new ArrayList<UserCourse>();
	
}
