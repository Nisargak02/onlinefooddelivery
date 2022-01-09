package com.cg.app.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {
	
	private Integer orderId;
	private LocalDateTime orderDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private FoodCart cart;
	private String orderStatus;
	

}