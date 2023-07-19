package com.arves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arves.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
