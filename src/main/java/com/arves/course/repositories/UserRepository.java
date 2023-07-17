package com.arves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arves.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
