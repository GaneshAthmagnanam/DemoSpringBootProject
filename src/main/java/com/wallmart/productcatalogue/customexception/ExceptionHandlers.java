package com.wallmart.productcatalogue.customexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers extends ResponseEntityExceptionHandler{

	@ExceptionHandler(MyResourceNotFoundException.class)
	public ResponseEntity<ExceptionResponse> resourceNotFound(MyResourceNotFoundException obj){
		ExceptionResponse myResponse= new ExceptionResponse();
		myResponse.setErrorCode("404");
		myResponse.setError_Message(obj.getMessage());
		return new ResponseEntity<ExceptionResponse>(myResponse,HttpStatus.NOT_FOUND);
	}
}
