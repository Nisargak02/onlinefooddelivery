package com.cg.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.app.entity.Category;
import com.cg.app.entity.Item;
import com.cg.app.entity.Restaurant;

public interface IItemRepository extends JpaRepository<Item,Integer>{
	
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item viewItem(Item item);
	public Item removeItem(Item item);
	public List<Item> viewAllItems(Category cat);
	public List<Item> viewAllItems(Restaurant res);
	public List<Item> viewAllItemsByName(String name);
	
	

}
