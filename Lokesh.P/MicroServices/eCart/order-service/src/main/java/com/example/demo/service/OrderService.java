package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;

import com.example.demo.dto.OrderLineItemsDto;
import com.example.demo.dto.OrderRequest;
import com.example.demo.dto.RequestInventory;
import com.example.demo.entity.Order;
import com.example.demo.entity.OrderLineItems;
import com.example.demo.repo.OrderRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

private final OrderRepo orderrepo;


private final WebClient webClient;
	
	public String placeOrder(OrderRequest orderRequest)
	{
		String msg=null;
		Order o = Order.builder()
                .orderNo(UUID.randomUUID().toString())
                .orderLineItems(orderRequest.getOrderLineItemsDtoList().stream()
                        .map(dto -> mapToDto(dto))
                        .toList())
                .build();
//		orderrepo.save(o);
		
		List<String> productNames=o.getOrderLineItems().stream().map(orderItemList->orderItemList.getPName()).toList();
		
		RequestInventory[] inventoryResponseArray=webClient.get()
		.uri("http://localhost:8003/inventory",uriBuilder->uriBuilder.queryParam("productNames", productNames).build())
		.retrieve() .bodyToMono(RequestInventory[].class).block();
		
		boolean stockCheckStatis=Arrays.stream(inventoryResponseArray).allMatch(inventory->inventory.isProductQuantity());
		if(stockCheckStatis)
		{
			orderrepo.save(o);
			msg="Order Placed Succsessfully";
		}
		else
		{
			msg="Some Products are Out of Stock!!!";
//			throw new IllegalArgumentException("Some Products are Out of Stock!!!");
		}
		return msg;
		 
	}
	public OrderLineItems mapToDto(OrderLineItemsDto dto)
	{
		return OrderLineItems.builder()
//				.pId(dto.getPId())
				.pName(dto.getPName())
				.productPrice(dto.getProductPrice())
				.productQuantity(dto.getProductQuantity()).build();
	}
}
