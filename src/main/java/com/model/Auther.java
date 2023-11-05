package com.model;

public class Auther {
	private int id;
	private String name;
	private Book book;
	
	public Auther() {
		super();
	}

	public Auther(int id, String name, Book book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Auther [id=" + id + ", name=" + name + ", book=" + book + "]";
	}
}
