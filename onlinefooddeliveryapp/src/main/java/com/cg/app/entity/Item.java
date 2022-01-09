package com.cg.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	private String itemId;
	private String itemName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Category category;
	private Integer quantity;
	private double cost;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Restaurant> restaurants;
	

}
