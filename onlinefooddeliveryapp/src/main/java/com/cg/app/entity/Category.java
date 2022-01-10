package com.cg.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
	
	@Id	
	private String catId;
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="category")
	private List<Item> items=new ArrayList<>();
	

}
