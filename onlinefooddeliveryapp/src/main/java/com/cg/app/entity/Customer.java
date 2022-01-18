package com.cg.app.entity;


import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;

	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	private String mobileNumber;
	private String email;
	private String password;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL,mappedBy="customer")
	private FoodCart foodCart;
	
	
	
	

}
