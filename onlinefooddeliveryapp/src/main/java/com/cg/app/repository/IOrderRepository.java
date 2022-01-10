package com.cg.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.app.entity.Customer;
import com.cg.app.entity.OrderDetails;
import com.cg.app.entity.Restaurant;

public interface IOrderRepository extends JpaRepository<OrderDetails,Integer>{
	
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails removeOrder(OrderDetails order);
	public OrderDetails viewOrder(OrderDetails order);
	public List<OrderDetails> viewAllOrders(Restaurant res);
	public List<OrderDetails> viewAllOrders(Customer customer);
	
	

}
