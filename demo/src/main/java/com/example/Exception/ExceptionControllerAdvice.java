package com.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.rest.controller.NoSuchCustomerException;

public class ExceptionControllerAdvice {

	public String Exceptionhandler(Exception ex) {
		return ex.getMessage();
	}
	
	public  ResponseEntity<ErrorMessage> Exceptionhandler2(NoSuchCustomerException ex) {
		
		ErrorMessage e=new ErrorMessage();
		e.setErrorcode(HttpStatus.BAD_REQUEST.value());
		e.setErrorMessage(ex.getMessage());
		return new ResponseEntity<>(e,HttpStatus.OK);
	}
}
