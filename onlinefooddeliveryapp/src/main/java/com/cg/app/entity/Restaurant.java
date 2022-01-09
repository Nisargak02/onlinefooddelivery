package com.cg.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
	
	private String restaurantId;
	private String restaurantName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	private List<Item> itemList;
	private String managerName;
	private String contactNumber;

}
