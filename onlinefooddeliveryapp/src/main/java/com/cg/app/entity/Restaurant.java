package com.cg.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
	
	@Id
	private String restaurantId;
	private String restaurantName;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy="restaurants")
	private List<Item> itemList;
	private String managerName;
	private String contactNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

}
