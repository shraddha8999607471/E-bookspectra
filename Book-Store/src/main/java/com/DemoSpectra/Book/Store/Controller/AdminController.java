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

import com.DemoSpectra.Book.Store.Service.AdminService;
import com.DemoSpectra.Book.Store.entity.Admin;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
     
	@PostMapping("/save")
	private Admin saveAdmin(@RequestBody Admin admin) {
		   return adminService.createAdmin(admin);
			}
	
	@GetMapping("/find/{id}")
	private Admin findAdnimById(@PathVariable Long id){
		return adminService.GetAdminById(id);
	}
	@GetMapping("/findAll")
	private List<Admin> findAllAdmins() {
		return adminService.getAllAdmin();
	}
	
	@DeleteMapping("/delete/{id}")
	private String deleteAdmin(@PathVariable Long id) {
		 adminService.deleteAdmin(id);
		 return "Admin Delete Sussecfully";
	}
	
	@PutMapping("/update/{id}")
	private Admin updateAdmin(@RequestBody Admin admin,@PathVariable Long id) {
		return adminService.updateAdmin(admin, id);
	}
		
	}
	
	
	


