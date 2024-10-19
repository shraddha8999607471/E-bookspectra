 package com.DemoSpectra.Book.Store.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DemoSpectra.Book.Store.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
