package com.example.demo.dto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrderLineItemsDto;
import com.example.demo.dto.OrderRequest;
import com.example.demo.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
	
	
	private final OrderService os;
	
	@PostMapping("/add")
	public String placeOrder(@RequestBody OrderRequest orderRequest)
	{
		System.out.println(orderRequest);
		
		return os.placeOrder(orderRequest) ;
//		List<OrderLineItemsDto> li = new ArrayList<>();
//		
//		li.add(new OrderLineItemsDto("aaa",1234.0,1));
//		
//		return li;
	}

}
