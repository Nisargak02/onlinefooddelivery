package com.cg.app.service;

import java.util.List;

import com.cg.app.entity.Customer;
import com.cg.app.entity.OrderDetails;
import com.cg.app.entity.Restaurant;

public interface IOrderService {
	
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails removeOrder(OrderDetails order);
	public OrderDetails viewOrder(OrderDetails order);
	public List<OrderDetails> viewAllOrders(Restaurant res);
	public List<OrderDetails> viewAllOrders(Customer customer);
	

}
