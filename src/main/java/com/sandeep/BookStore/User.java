package com.sandeep.BookStore;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class User {

	@Id
	private int id;
	private String name;
	
	//@OneToOne
	//private Book book;
	
	/*
	 * @OneToMany private List<Book> books= new ArrayList<Book>();
	 * 
	 * public List<Book> getBooks() { return books; } public void
	 * setBooks(List<Book> books) { this.books = books; }
	 */
	
	/*
	 * public Book getBook() { return book; } public void setBook(Book book) {
	 * this.book = book; }
	 */	
	
	@ManyToMany
	private List<Book> books = new ArrayList<Book>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
