package com.arves.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arves.course.entities.Category;
import com.arves.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> listCategory = service.findAll();
		return ResponseEntity.ok().body(listCategory);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category user = service.findById(id);
		return ResponseEntity.ok().body(user);
	}
}