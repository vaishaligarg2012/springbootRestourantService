package com.infogain.restaurant.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.infogain.restaurant.entity.Product;

@Service
public interface ProductService {
	Optional<Product> getProduct(long id);
	List<Product> getProductByCategory(String categroy);
}
