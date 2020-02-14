package com.infogain.restaurant.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infogain.restaurant.entity.Order;
import com.infogain.restaurant.entity.OrderItem;
@Service
public interface OrderService {
	List<Order> getOrdersByUserId(long id);
	String saveOrder(List<OrderItem> orderItems, Long userId);
}
