package com.ajay.springbootmongodb.exception;

public class TodoCollectionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TodoCollectionException(String message) {
		super(message);
	}

	public static String NotFountException(String id) {
		return "Todo with " + id + "not found!";
	}

	public static String TotoAlreadyExists() {
		return "Todo with given name already exists!";
	}
}
