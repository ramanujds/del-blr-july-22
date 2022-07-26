package com.del.foodieapp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.del.foodieapp.exception.DuplicateItemException;

@ControllerAdvice
public class FoodieAppErrorController {

	
	@ExceptionHandler(DuplicateItemException.class)
	public String handleDuplicateItemException(Exception ex, HttpServletResponse response) throws IOException {
		response.sendError(409, ex.getMessage());
		return "error";
	}
	
}
