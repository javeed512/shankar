package com.capg.cust.beans;

import java.sql.Date;

public class Customer {

	private int cid;
	private String cname;
	private double amount;
	private  Date dop;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", amount=" + amount + ", dop=" + dop + "]";
	}
	
	
	
}
