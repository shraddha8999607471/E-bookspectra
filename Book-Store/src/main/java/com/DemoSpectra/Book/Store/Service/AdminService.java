package com.DemoSpectra.Book.Store.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DemoSpectra.Book.Store.dao.AdminRepository;
import com.DemoSpectra.Book.Store.entity.Admin;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository adminrepository;
	
	public Admin createAdmin(Admin admin) {
	    return adminrepository.save(admin);
	}
	public Admin GetAdminById(Long id) {
		return adminrepository.findById(id).get();
		
	}
	public List<Admin>getAllAdmin(){
		return adminrepository.findAll();
	}
	public String deleteAdmin(Long id) {
		 adminrepository.deleteById(id);
		 return "Admin Delete Sussecfully";
	}
	
	public Admin updateAdmin(Admin ad,Long id) {
		Admin admin = adminrepository.findById(id).get();
		
		if(admin.getName()!=null) {
			admin.setName(ad.getName());
		}
		if(admin.getPassword()!=null) {
			admin.setPassword(ad.getPassword());
		}
		if(admin.getEmail()!=null) {
			admin.setEmail(ad.getEmail());
		}
		if(admin.getContact()!=null) {
			admin.setContact(ad.getContact());
		}
		return adminrepository.save(admin);
		
	}
	
	
	
	

}
