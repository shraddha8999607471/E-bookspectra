package com.DemoSpectra.Book.Store.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DemoSpectra.Book.Store.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

}
