package com.infogain.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogain.restaurant.entity.Order;
import com.infogain.restaurant.entity.OrderItem;
import com.infogain.restaurant.services.OrderService;

@RestController
@RequestMapping("api/v1/orders")
public class Orders {
@Autowired
private OrderService orderService;
@PostMapping("{userId}")
public String createOrder(@RequestBody List<OrderItem> orderItem,@PathVariable ("userId") long userId) {
	
	return orderService.saveOrder(orderItem, userId);
}
@GetMapping("{userId}")
public List<Order> getOrders(@PathVariable ("userId") long userId){
	return orderService.getOrdersByUserId(userId);
}
}
