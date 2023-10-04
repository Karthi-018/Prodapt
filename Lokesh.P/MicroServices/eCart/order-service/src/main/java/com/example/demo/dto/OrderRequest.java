package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.OrderLineItems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {

	private List<OrderLineItemsDto> orderLineItemsDtoList;
}
