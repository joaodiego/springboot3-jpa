package com.jdtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdtech.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
