package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domains.User;
import com.example.demo.repositories.UserRepository;

@Service
@Transactional
public class UserService {
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	public User create(User user) {
		return this.userRepository.save(user);
	}

	
	public List<User> read() {
		return this.userRepository.findAll();
	}
	
	public void delete(Long id) {
	 this.userRepository.deleteById(id);
	}
}
