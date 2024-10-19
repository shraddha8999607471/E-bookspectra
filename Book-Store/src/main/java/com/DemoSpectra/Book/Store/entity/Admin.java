package com.DemoSpectra.Book.Store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
	

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String Password;
	private String Email;
	private Long Contact;
	
}
