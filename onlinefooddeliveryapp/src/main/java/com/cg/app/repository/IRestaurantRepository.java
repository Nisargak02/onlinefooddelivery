package com.cg.app.repository;

import java.util.List;

import com.cg.app.entity.Restaurant;

public interface IRestaurantRepository {
	
	public Restaurant addRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Restaurant res);
	public Restaurant removeRestaurant(Restaurant res);
	public Restaurant viewRestaurant(Restaurant res);
	public List<Restaurant> viewNearByRestaurant(String location);
	public List<Restaurant> viewRestaurantByItemName(String name);
	
	
	

}
