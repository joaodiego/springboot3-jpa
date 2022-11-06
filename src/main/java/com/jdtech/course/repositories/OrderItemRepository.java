package com.jdtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdtech.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
