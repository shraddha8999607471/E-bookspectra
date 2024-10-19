package com.DemoSpectra.Book.Store.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DemoSpectra.Book.Store.Exception.BooksNotFoundException;
import com.DemoSpectra.Book.Store.dao.BooksRepository;
import com.DemoSpectra.Book.Store.dto.BooksRequest;
import com.DemoSpectra.Book.Store.entity.Books;

@Service
public class BooksService {
	
	@Autowired
	BooksRepository booksrepository;
	
	public Books CreateBooks(BooksRequest booksRequest) {
		Books books=Books.build(booksRequest.getId(), booksRequest.getName(), booksRequest.getAuthor(), booksRequest.getCatagory(), booksRequest.getPrice(),
				booksRequest.getLanguage());
				return booksrepository.save(books);
	}
	
	public Books GetBooks(Long id) throws BooksNotFoundException {
		Books books = booksrepository.findBooksById(id);
		if(books!=null) {
			return books;
		}else {
			throw new BooksNotFoundException("Books Not Found with Id:"+id);
		}
	}
	
	public List<Books> GetfindAllBooks(){
		return booksrepository.findAll();
		}
	public String DeleteBooks(Long id) {
		booksrepository.deleteById(id);
		return "Books Deleted Succecfully";
	}
	
	public Books UpdateBooks(Books bs,Long id) {
		Books books=booksrepository.findById(id).get();
		
		if(books.getName()!=null) {
			books.setName(bs.getName());
		}
		if(books.getAuthor()!=null) {
			books.setAuthor(bs.getAuthor());
		}
	   if(books.getCatagory()!=null) {
		   books.setCatagory(bs.getCatagory());
	   }
	   if(books.getLanguage()!=null) {
		   books.setLanguage(bs.getLanguage());
	   }
	   if(books.getPrice()!=null) {
		   books.setPrice(bs.getPrice());
        }
	   return booksrepository.save(books);
	   }
}

