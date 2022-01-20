package com.cg.app.service;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.entity.Bill;
import com.cg.app.entity.Customer;
import com.cg.app.entity.FoodCart;
import com.cg.app.entity.OrderDetails;
import com.cg.app.exceptions.BillException;
import com.cg.app.repository.IBillRepository;


@Service
public class IBillServiceImpl implements IBillService{

	
	@Autowired
	private IBillRepository billRepo;
	
	@Override
	public Bill addBill(Bill bill) {

		Bill savedBill= billRepo.save(bill);
		
		
		OrderDetails order = new OrderDetails();
		
		//giving orderId as same as bill Id
		order.setOrderId(savedBill.getBillId());
	
		//associating OrderDetails object with the bill
		//order.setBill(bill);
		
		
		//orderRepo.save(order);
		
		return savedBill;
	}

	@Override
	public Bill updateBill(Bill bill) throws BillException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill removeBill(Integer billId) throws BillException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill viewBill(Integer billId) throws BillException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) throws BillException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> viewBills(String custId) throws BillException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateTotalCost(Bill bill) throws BillException {
		// TODO Auto-generated method stub
		return 0;
	}
	
}