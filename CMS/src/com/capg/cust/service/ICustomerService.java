package com.capg.cust.service;

import java.util.List;

import com.capg.cust.beans.Customer;

public interface ICustomerService {

	int addCustomer(Customer c);

	int updateCustomer(Customer c);

	Customer getCustomerById(int cid);

	int deleteCustomerById(int cid);

	List<Customer> getAllCustomers();

}
