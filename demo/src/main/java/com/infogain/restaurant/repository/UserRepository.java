package com.infogain.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infogain.restaurant.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
