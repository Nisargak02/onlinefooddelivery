package com.cg.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String itemId;
	private String itemName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Category category;
	private Integer quantity;
	private double cost;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Restaurant> restaurants;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private FoodCart foodCart;

}
