package com.infogain.restaurant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infogain.restaurant.entity.Order;
import com.infogain.restaurant.entity.Product;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
List<Order> findAllByUserId(long id);
}
