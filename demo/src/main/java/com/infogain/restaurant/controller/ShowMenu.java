package com.infogain.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogain.restaurant.entity.Product;
import com.infogain.restaurant.services.ProductService;

@RestController
@RequestMapping("api/v1/menus")
public class ShowMenu {
@Autowired
ProductService productService;
@GetMapping("{category}")
public List<Product> getAllMenuByCategory(@PathVariable ("category") String category){
	return productService.getProductByCategory(category);
}
}
