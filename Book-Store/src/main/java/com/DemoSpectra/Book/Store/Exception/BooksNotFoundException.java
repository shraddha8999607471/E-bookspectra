package com.DemoSpectra.Book.Store.Exception;


public class BooksNotFoundException extends Exception {
	
	private static final long serialVersionUID =1L;
	
	public BooksNotFoundException() {
	super();
	}
	
    public BooksNotFoundException(String message,Throwable cause,boolean enableSuppression,
    		boolean writableStackTrace) {
    	super(message,cause,enableSuppression,writableStackTrace);
    }
    public BooksNotFoundException(String message,Throwable cause) {
    	super(message,cause);
    }
    public BooksNotFoundException(String message) {
    	super(message);
    }
    public BooksNotFoundException(Throwable cause) {
    	super(cause);
    }
    
}
