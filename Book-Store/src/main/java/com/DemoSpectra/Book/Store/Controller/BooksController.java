package com.DemoSpectra.Book.Store.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DemoSpectra.Book.Store.Exception.BooksNotFoundException;
import com.DemoSpectra.Book.Store.Service.BooksService;
import com.DemoSpectra.Book.Store.dto.BooksRequest;
import com.DemoSpectra.Book.Store.entity.Admin;
import com.DemoSpectra.Book.Store.entity.Books;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Books")
public class BooksController {
	
	@Autowired
	BooksService booksservice;
	
	@PostMapping("/signup")
	public ResponseEntity<Books> saveBooks( @RequestBody @Valid BooksRequest booksRequest) {
		return new ResponseEntity<Books> (booksservice.CreateBooks(booksRequest),HttpStatus.CREATED);
	}
	
	@GetMapping("/FindById/{id}")
	public ResponseEntity<Books> getbooks(@PathVariable Long id)throws BooksNotFoundException {
		return ResponseEntity.ok(booksservice.GetBooks(id));
	}                                                                      
	@GetMapping("/fetchAll")
	public ResponseEntity<List<Books>> getAllBooks(){
	return ResponseEntity.ok(booksservice.GetfindAllBooks());
	}
	@DeleteMapping("/Delete/{id}")
	public String DeleteBooks(@PathVariable Long id) {
	booksservice.DeleteBooks(id);
	return"Books Deleted Sucessfully";
	}
	 @PutMapping("/Update/{id}")
	 public Books UpdateBooks(@RequestBody Books books,@PathVariable Long id) {
	 return booksservice.UpdateBooks(books, id);
	 
	 }
}
