package com.myproject.springdemo.service;

import java.util.List;

import com.myproject.springdemo.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

}
