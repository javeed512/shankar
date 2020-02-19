package com.capgemini.ewallet.ui;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.ewallet.beans.Account;
import com.capgemini.ewallet.service.EWalletServiceImp;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EWalletServiceImp service = new EWalletServiceImp();

		service.fundTransfer();
		
		Map map = service.getDao().getMap();

		System.out.println("before transaction ");
		System.out.println(map);

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter From Account Number");

		int fromAccountNumber = scan.nextInt();

		System.out.println("Amount to be Transfer");

		double amount = scan.nextDouble();

		System.out.println("Enter To Account Number");

		int toAccountNumber = scan.nextInt();

		

		Account a1 = null;
		Account a2 = null;
		Set<Integer> set = map.keySet();

		for (Integer key : set) {

			if (key.equals(fromAccountNumber)) {

				a1 = (Account) map.get(key);

			}

			if (key.equals(toAccountNumber)) {

				a2 = (Account) map.get(key);

			}

		}

		double newBalance1 = a1.getAccountBalance() - amount;

		double newBalance2 = a2.getAccountBalance() + amount;

		a1.setAccountBalance(newBalance1);

		a2.setAccountBalance(newBalance2);

		map.put(fromAccountNumber, a1);
		map.put(toAccountNumber, a2);

		service.getDao().setMap(map);

		System.out.println("after transaction ");
		System.out.println(map);

	}

}
