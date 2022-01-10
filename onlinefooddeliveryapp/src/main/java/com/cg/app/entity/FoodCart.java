package com.cg.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodCart {
	
	@Id
	private String cartId;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="foodCart")
	private List<Item> itemList;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;


}
