package com.arves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arves.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
