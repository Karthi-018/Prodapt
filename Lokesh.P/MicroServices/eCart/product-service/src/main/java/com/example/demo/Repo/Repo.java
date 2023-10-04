package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface Repo extends JpaRepository<Product, Integer> {

}
