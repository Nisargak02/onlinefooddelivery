package com.cg.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.app.entity.Bill;

public interface IBillRepository extends JpaRepository<Bill,Integer>{
	
	/*public Bill addBill(Bill bill);
	public Bill updateBill(Bill bill);
	public Bill removeBill(Integer billId);
	public Bill viewBill(Integer billId);
	public List<Bill> viewBills(LocalDate startDate,LocalDate endDate);
	public List<Bill> viewBills();
	public double calculateTotalCost(Bill bill);*/
	

}
