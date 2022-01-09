package com.cg.app.repository;

import java.time.LocalDate;
import java.util.List;

import com.cg.app.entity.Bill;

public interface IBillRepository {
	
	public Bill addBill(Bill bill);
	public Bill updateBill(Bill bill);
	public Bill removeBill(Bill bill);
	public Bill viewBill(Bill bill);
	public List<Bill> viewBills(LocalDate startDate,LocalDate endDate);
	public List<Bill> viewBills(String custId);
	public double calculateTotalCost(Bill bill);
	

}
