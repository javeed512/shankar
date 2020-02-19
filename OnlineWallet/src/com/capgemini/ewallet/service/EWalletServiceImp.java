package com.capgemini.ewallet.service;

import java.util.Map;

import com.capgemini.ewallet.beans.Account;
import com.capgemini.ewallet.dao.EWalletDAOImp;
import com.capgemini.ewallet.dao.IEWalletDAO;

public class EWalletServiceImp implements IEwalletService {

	
	// validations 
	
	// isValidAccount();
	
	
	EWalletDAOImp dao = new EWalletDAOImp();
	
	
	public EWalletDAOImp getDao() {
		return dao;
	}


	public void setDao(EWalletDAOImp dao) {
		this.dao = dao;
	}


	@Override
	public boolean fundTransfer() {
		// TODO Auto-generated method stub
		return dao.fundTransfer();
	}

}
