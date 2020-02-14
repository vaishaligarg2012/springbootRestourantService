package com.infogain.restaurant.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.infogain.restaurant.entity.User;
@Service
public interface UserService {
Optional<User> getUser(long id);
}
