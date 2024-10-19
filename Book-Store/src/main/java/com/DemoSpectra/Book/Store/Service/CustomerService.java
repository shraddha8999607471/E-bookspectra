package com.DemoSpectra.Book.Store.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DemoSpectra.Book.Store.dao.CustomerRepository;
import com.DemoSpectra.Book.Store.entity.Customer;

@Service
public class CustomerService {
      
	 @Autowired
	  CustomerRepository customerrepository;
	 
	 public Customer AddCustomer(Customer customer) {
		 return customerrepository.save(customer);
	 }
	 
	 public Customer GetCustomerById(Long id) {
		 return customerrepository.findById(id).get();
	 }
	 public List<Customer> GetfindAllcustomer(){
		 return customerrepository.findAll();
	 }
     public String DeleteCustomer(Long id) {
    	 customerrepository.deleteById(id);
    	 return "Customer Deleted Succecfully";
     }
     public Customer UpdateCustomer(Customer ct,Long id) {
    	 Customer customer=customerrepository.findById(id).get();
    	 
    	 if(customer.getName() != null) {
    		 customer.setName(ct.getName());
    	 }
    	 if(customer.getAddress() != null) {
    		 customer.setAddress(ct.getAddress());
    	 }
         if(customer.getEmail() != null) {
        	 customer.setEmail(ct.getEmail());
    	 }
    	 if(customer.getContact() != null) {
    		 customer.setContact(ct.getContact());
    	 }
    	 if(customer.getPassword() != null) {
    		 customer.setPassword(ct.getPassword());
    		 
    	 }
    	 return customerrepository.save(customer);
    	 
    	 }
     }
