package com.capgemini.ewallet.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.ewallet.beans.Account;

public class EWalletDAOImp implements IEWalletDAO {

	Map<Integer, Account> map = new HashMap<Integer, Account>();

	public Map<Integer, Account> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Account> map) {
		this.map = map;
	}

	@Override
	public boolean fundTransfer() {

		Account ac = map.put(1001, new Account(1001, "sai", 9000.0));

		System.out.println(ac);

		map.put(1002, new Account(1002, "tom", 8000));
		map.put(1003, new Account(1003, "king", 7000));

		return false;
	}

}
