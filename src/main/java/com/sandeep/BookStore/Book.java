package com.sandeep.BookStore;

import java.util.List;
import java.util.ArrayList;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	private int id;
	private String bookName;
	
	/*
	 * @ManyToOne private User user;
	 */
	
	@ManyToMany
	private List<User> users = new ArrayList<User>();
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	/*
	 * public User getUser() { return user; } public void setUser(User user) {
	 * this.user = user; }
	 */
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
