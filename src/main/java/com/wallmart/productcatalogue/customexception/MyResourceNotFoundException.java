package com.wallmart.productcatalogue.customexception;

public class MyResourceNotFoundException extends RuntimeException {
	
	public MyResourceNotFoundException(String errorMessage){
		super(errorMessage);
	}
}
