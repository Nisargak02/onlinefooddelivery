package com.cg.app.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.app.entity.Bill;
import com.cg.app.exceptions.BillNotFoundException;
import com.cg.app.exceptions.CustomerNotFoundException;
import com.cg.app.repository.IBillRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class IBillServiceImpl implements IBillService {
	
	@Autowired
	private IBillRepository billRepo;

	@Override
	public Bill addBill(Bill bill) {

		log.info("Inside the addBill method");
		Bill savedBill= billRepo.save(bill);
		log.debug("Customer saved with the ID:"+savedBill.getBillId());
		
		return savedBill;
	}

	@SuppressWarnings("unused")
	@Override
	public Bill updateBill(Bill bill) throws CustomerNotFoundException{
		
		Optional<Bill> opt=billRepo.findById(bill.getBillId());
		if(opt.isPresent()) {
			Bill existingBill=opt.get();
			return billRepo.save(bill);
		}

		throw new CustomerNotFoundException("Invalid Customer");
	}

	@Override
	public Bill removeBill(Integer billId) throws BillNotFoundException {
		
		Optional<Bill> opt=billRepo.findById(billId);
		if(opt.isPresent()) {
			Bill bill=opt.get(); 
			billRepo.delete(bill);
			
			return bill;
		}

		throw new BillNotFoundException("Invalid Bill");
	}

	@SuppressWarnings("unused")
	@Override
	public Bill viewBill(Integer billId) {
		Optional<Bill> opt=billRepo.findById(billId);
		Bill bill=viewBill(billId);
		return bill;
	}

	@Override
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
		
		return null;
	}

	@Override
	public List<Bill> viewBills(Integer custId){
		return null;
	}

	@Override
	public double calculateTotalCost(Bill bill) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
