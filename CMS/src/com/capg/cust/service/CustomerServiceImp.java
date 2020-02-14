package com.capg.cust.service;

import java.util.List;

import com.capg.cust.beans.Customer;
import com.capg.cust.dao.CustomeDAOImp;
import com.capg.cust.dao.ICustomerDAO;

public class CustomerServiceImp implements ICustomerService {

		ICustomerDAO dao =	new CustomeDAOImp();
	
	@Override
	public int addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return dao.addCustomer(c);
	}

	@Override
	public int updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCustomerById(int cid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean isValidCid(int cid) {

		boolean flag = false;

		if (cid != 0 && (cid > 99 && cid < 1000)) {
			flag = true;
		}

		return flag;

	}

	public static boolean isValidCName(String cname) {

		boolean flag = false;

		if (cname.length() >= 3) {

			flag = true;
		}

		return flag;
	}

	public static boolean userValidations(Customer c) {

		boolean flag =false;
		
		if(isValidCid(c.getCid()) && isValidCName(c.getCname())) {
			
			flag = true;
			
		}

		return flag;

	}

}
