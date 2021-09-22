package com.dio.loans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dio.loans.model.Customer;
import com.dio.loans.model.Loans;
import com.dio.loans.repository.LoansRepository;

@RestController
public class LoansController {
	
	@Autowired
	private LoansRepository loansRepository;

	@PostMapping("/myLoans")
	public Loans getAccountsDetails(@RequestBody Customer customer) {
		Loans loans = loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());

		if (loans != null) {
			return loans;
		} else {
			return null;
		}
		
	}

}
