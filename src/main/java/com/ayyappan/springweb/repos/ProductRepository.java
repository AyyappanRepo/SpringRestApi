package com.ayyappan.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayyappan.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
