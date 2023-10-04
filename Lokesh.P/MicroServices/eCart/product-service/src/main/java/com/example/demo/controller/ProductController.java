package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProService;
import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;
import com.example.demo.entity.Product;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
	
	@Autowired
	ProService ps;
	
	@PostMapping("/add")
	public void addProduct(@RequestBody ProductRequest productRequest)
	{
		ps.addProduct(productRequest);
	}
	
	@GetMapping("/get")
	public List<ProductResponse> getAllproducts()
	{
		return ps.getproducts();
	}


	
}
