package com.cg.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.entity.Customer;
import com.cg.app.entity.FoodCart;
import com.cg.app.entity.OrderDetails;
import com.cg.app.entity.Restaurant;
import com.cg.app.exceptions.CartException;
import com.cg.app.exceptions.CustomerException;
import com.cg.app.exceptions.OrderException;
import com.cg.app.repository.ICartRepository;
import com.cg.app.repository.IOrderRepository;

@Service
public class IOrderServiceImpl implements IOrderService {
	
	@Autowired
	private IOrderRepository orderRepo;
	
	@Autowired
	private ICartRepository cartRepo;
	


	@Override
	public OrderDetails addOrder(OrderDetails order)  {
		 OrderDetails savedOrderDetails=orderRepo.save(order);
		 
		 FoodCart cart= new FoodCart();
		 
		 cart.setCartId(savedOrderDetails.getOrderId());
		 
		 cart.setOrderDetails(order);
		 
		 cartRepo.save(cart);
		 
		return savedOrderDetails;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) throws OrderException {
		if(orderRepo.existsById(order.getOrderId())) {
			
		
		return orderRepo.save(order);
		}
		throw new OrderException("Invalid order details");
	}

	@Override
	public OrderDetails removeOrder(OrderDetails order) throws OrderException {
		Optional<OrderDetails> opt= orderRepo.findById(order);
	
		if(opt.isPresent()) {
			OrderDetails order= opt.get();
			orderRepo.delete(order);
		
		return order;
	}
		else
			throw new OrderException("order does not exits with Id:" +order);
	}
	@Override
	public OrderDetails viewOrder(OrderDetails order) throws OrderException {
		Optional<OrderDetails> opt= orderRepo.findById(order);
		
		if(opt.isPresent()) {
			OrderDetails order=opt.get();
		
		return order;
	}
		else
			throw new OrderException("order does not exits with Id:" +order);
	}

	@Override
	public List<OrderDetails> viewAllOrders(Restaurant restaurant) throws OrderException {
		List<OrderDetails> orderList = orderRepo.findAll();
		if(orderList.size()>0)
		
		return orderList ;
		throw new OrderException("No orders found");
	}

	@Override
	public List<OrderDetails> viewAllOrders(Customer customer) throws OrderException, CustomerException {
		
		return null;
	}
	
}
