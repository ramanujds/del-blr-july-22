package com.del.foodieapp.exception;

public class DuplicateItemException extends RuntimeException{

	private static final long serialVersionUID = 8158194154805978201L;

	public DuplicateItemException(String message) {
		super(message);
	}
	
}
