package com.DemoSpectra.Book.Store.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DemoSpectra.Book.Store.Service.CustomerService;
import com.DemoSpectra.Book.Store.entity.Customer;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired 
	CustomerService customerservice;
	@PostMapping("/save")
	public Customer savecustomer(@RequestBody  Customer customer) {
		return customerservice.AddCustomer(customer);
	}
	
	@GetMapping("/findById/{id}")
	public Customer findCustomerById(@PathVariable Long id) {
		return customerservice.GetCustomerById(id);
	}
	
	@GetMapping("/findAll")
	public List<Customer> findAllCustomers(){
	return customerservice.GetfindAllcustomer();
	}
	
	@DeleteMapping("/Delete/{id}")
	public String DeleteCustomer(@PathVariable Long id) {
	customerservice.DeleteCustomer(id);
	return"Custumers Deleted Sucessfully";
	}
	 @PutMapping("/Update/{id}")
	 public Customer UpdateCustomer(@RequestBody Customer customer,@PathVariable Long id) {
	   return customerservice.UpdateCustomer(customer, id);
	 
	 }

		
	}
	
