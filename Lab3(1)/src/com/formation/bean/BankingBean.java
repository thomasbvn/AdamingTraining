package com.formation.bean;

import javax.annotation.ManagedBean;

import com.formation.domain.Customer;
import com.formation.service.CustomerService;
import com.formation.service.CustomerServiceImpl;

@ManagedBean
public class BankingBean{
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String customerId;
	private String password;
	public Customer getCustomer() {
		return customer;
	}
	private Customer customer;
	private static CustomerService lookupService = new CustomerServiceImpl();
	public String showBalance() {
		if (!password.equals("secret")) {
			return ("wrong-password");
		}
		customer=lookupService.findCustomer(customerId);
		if (customer==null) {
			return ("unknown-customer");
		}
		else if (customer.getBalance()<0) {
				return ("negative-balance");
			}
		else if (customer.getBalance()<10000) {
			return ("normal-balance");	
		}
		else {
			return ("high-balance");
		}
	}
}