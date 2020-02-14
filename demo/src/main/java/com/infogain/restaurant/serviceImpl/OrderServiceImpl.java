package com.infogain.restaurant.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogain.restaurant.entity.Order;
import com.infogain.restaurant.entity.OrderItem;
import com.infogain.restaurant.entity.Product;
import com.infogain.restaurant.entity.User;
import com.infogain.restaurant.enums.USERTYPE;
import com.infogain.restaurant.repository.OrderRepository;
import com.infogain.restaurant.services.OrderService;
import com.infogain.restaurant.services.ProductService;
import com.infogain.restaurant.services.UserService;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
	private OrderRepository orderRepository;
    @Autowired
    private UserService userService;
    @Autowired ProductService productService;
	@Override
	public List<Order> getOrdersByUserId(long id) {
		return orderRepository.findAllByUserId(id);
	}

	@Override
	public String saveOrder(List<OrderItem> orderItems,Long userId) {
		Order order=new Order();
		Double grandTotal=0d;
		for(OrderItem items:orderItems) {
			Optional<Product> product=productService.getProduct(items.getProductId());
			if(!product.isPresent()) {
				return "Product not found";
			}
			grandTotal+=items.getQuantity()*product.get().getPrice();
		}
		Optional<User> user=userService.getUser(userId);
		if(user.isPresent()) {
			Date date=new Date();
			if(user.get().getType().equalsIgnoreCase(USERTYPE.NORMAL.getLable())) {
				if(date.getDay()==0 ||date.getDay()==6) {
					grandTotal=grandTotal*.9;
				}	else{
					grandTotal-=10;
				}
			}else {
				grandTotal=grandTotal*.9;
			}
			order.setCreatedAt(date);
			order.setUpdatedAt(date);
			order.setGrandTotal(grandTotal);
			order.setUserId(userId);
			order.setOrderStatus("created");
			orderRepository.save(order);
		}else {
			return "User not found";
		}
		
		return "order created successfully";
	}

}
