package com.jdtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdtech.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
