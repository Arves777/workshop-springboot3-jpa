package com.arves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arves.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
