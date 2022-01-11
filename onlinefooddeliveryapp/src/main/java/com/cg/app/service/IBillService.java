package com.cg.app.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.app.entity.Bill;
import com.cg.app.exceptions.BillNotFoundException;

public interface IBillService {
	
	public Bill addBill(Bill bill);
	public Bill updateBill(Bill bill) throws BillNotFoundException;
	public Bill removeBill(Integer billId) throws BillNotFoundException;
	public Bill viewBill(Integer billId);
	public List<Bill> viewBills(LocalDate startDate,LocalDate endDate);
	public List<Bill> viewBills();
	public double calculateTotalCost(Bill bill);
	

}
