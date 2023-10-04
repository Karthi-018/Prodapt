package com.example.demo.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderLineItemsDto {
//	private Integer pId;
	private String pName;
	private Double productPrice;
	private Integer productQuantity;

}
