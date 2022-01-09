package com.cg.app.repository;

import com.cg.app.entity.FoodCart;
import com.cg.app.entity.Item;

public interface ICartRepository {
	
	public FoodCart addItemToCart(FoodCart cart,Item item);
	public FoodCart increaseQuantity(FoodCart cart,Item item,int quantity);
	public FoodCart reduceQuantity(FoodCart cart,Item item,int quantity);
	public FoodCart removeItem(FoodCart cart,Item item);
	public FoodCart clearCart(FoodCart cart);
	

}
