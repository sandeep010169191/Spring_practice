package com.sandeep.BookStore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
    	
      Book book1=new Book();
      book1.setId(101);
      book1.setBookName("Bhagvad Gita");
      
      Book book2=new Book();
      book2.setId(102);
      book2.setBookName("Harry Potter");
      
      
      List<Book> list = Arrays.asList(book1,book2);
      
      User user=new User();
      user.setId(1);
      user.setName("Rohit");
      //user.setBooks(list);
      //user.setBook(book);
      user.setBooks(list);
      
      
      User user1=new User();
      user1.setId(2);
      user1.setName("Devansh");
      user1.setBooks(Arrays.asList(book2));
     
     book1.getUsers().add(user);
      book2.getUsers().add(user1);
    	
      Configuration config= new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(User.class);
      SessionFactory factory=config.buildSessionFactory();
      Session session = factory.openSession();
  	  Transaction tx = session.beginTransaction();
  	  
  	  session.save(book1);
  	  session.save(book2);
  	  session.save(user1);
  	  session.save(user);
  	  tx.commit();
  	  
    }
}
