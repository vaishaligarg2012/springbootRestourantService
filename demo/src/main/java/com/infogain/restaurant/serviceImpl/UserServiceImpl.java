package com.infogain.restaurant.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogain.restaurant.entity.User;
import com.infogain.restaurant.repository.UserRepository;
import com.infogain.restaurant.services.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
UserRepository userRepository;
	@Override
	public Optional<User> getUser(long id) {
		
		return userRepository.findById(id);
	}

}
