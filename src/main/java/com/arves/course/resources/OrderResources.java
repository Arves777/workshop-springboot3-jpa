package com.arves.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arves.course.entities.Order;
import com.arves.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> listOrder = service.findAll();
		return ResponseEntity.ok().body(listOrder);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order user = service.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
