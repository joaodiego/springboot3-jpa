package com.jdtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdtech.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
