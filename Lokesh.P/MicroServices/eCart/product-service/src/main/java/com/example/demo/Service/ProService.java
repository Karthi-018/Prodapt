package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.Repo;
import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;
import com.example.demo.entity.Product;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProService {
	
//	@Autowired
//	Repo repo;
	private final Repo repo;
	
	public String addProduct(ProductRequest productRequest)
	{
		Product p=Product.builder()

				.name(productRequest.getName())

				.price(productRequest.getPrice())

				.quantity(productRequest.getQuantity()).build();
//		Product p=new Product();
//		p.setName(productRequest.getName());
//		p.setPrice(productRequest.getPrice());
//		p.setQuantity(productRequest.getQuantity());
		repo.save(p);
		return "added";
	}
	public List<ProductResponse> getproducts()
	{
		List<Product> products =repo.findAll();
		List<ProductResponse> responseproduct=products.stream().map(pro->mapToProductResponse(pro)).toList();
		return responseproduct;
		
	
	}
	
	private ProductResponse mapToProductResponse(Product pro)
	{
	ProductResponse ps=new ProductResponse();
	ps.setId(pro.getId());
	ps.setName(pro.getName());
	ps.setPrice(pro.getPrice());
	ps.setQuantity(pro.getQuantity());
	return ps;
	}
	

	

}
