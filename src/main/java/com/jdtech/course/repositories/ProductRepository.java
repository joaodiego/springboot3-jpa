package com.jdtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdtech.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
