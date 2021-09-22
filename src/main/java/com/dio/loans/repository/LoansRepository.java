package com.dio.loans.repository;

import org.springframework.data.repository.CrudRepository;

import com.dio.loans.model.Loans;

public interface LoansRepository extends CrudRepository<Loans, Long>{

	Loans findByCustomerIdOrderByStartDtDesc(int customerId);

}
