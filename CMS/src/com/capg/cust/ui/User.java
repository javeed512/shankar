package com.capg.cust.ui;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import com.capg.cust.beans.Customer;
import com.capg.cust.service.CustomerServiceImp;
import com.capg.cust.service.ICustomerService;

public class User {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ICustomerService service = new CustomerServiceImp();

		while (true) {

			System.out.println("WELCOME TO CMS");
			System.out.println("1. ADD CUSTOMER");
			System.out.println("2. UPDATE CUSTOMER");
			System.out.println("3. DELETE CUSTOMER ");
			System.out.println("4. SELECT CUSTOMER");
			System.out.println("5. SELECT ALL CUSTOMERS");
			System.out.println("6. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter CID");
				int cid = scanner.nextInt();
					
					scanner.nextLine();
				
				System.out.println("Enter CNAME");

				String cname = scanner.nextLine();

				System.out.println("Enter AMOUNT");

				double amount = scanner.nextDouble();

				Customer customerBean = new Customer();

					customerBean.setCid(cid);
				
					customerBean.setCname(cname);
					
					customerBean.setAmount(amount);
					
				
				boolean isValid =	CustomerServiceImp.userValidations(customerBean);
					
				
					if(isValid) {
				
				service.addCustomer(customerBean);
					}
					
					else {
						
						System.err.println("Invalid Input data");
					}

				break;
			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:

				System.out.println("Thank You Visit Again");

				break;

			default:

				System.err.println("Invalid Option");

				break;
			}

		}

	}

}
