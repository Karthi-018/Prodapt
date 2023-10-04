package com.example.demo.dto;

import com.example.demo.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductRequest {

	private String name;
	private Double price;
	private Integer quantity;
}
