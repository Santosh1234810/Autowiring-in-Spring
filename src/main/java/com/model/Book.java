package com.model;

public class Book {
	private String bookName;

	public Book() {
		super();
	}

	public Book(String name) {
		super();
		this.bookName = name;
	}

	public String getName() {
		return bookName;
	}

	public void setName(String name) {
		this.bookName = name;
	}

	@Override
	public String toString() {
		return "Book [name=" + bookName + "]";
	}
	
}
