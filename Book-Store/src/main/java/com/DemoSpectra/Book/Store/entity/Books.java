package com.DemoSpectra.Book.Store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="BOOKS_TBL")
@Data
@AllArgsConstructor(staticName ="build")
@NoArgsConstructor
public class Books {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String author;
	private String catagory;
	private Long Price;
	private String language;
	
	

}
