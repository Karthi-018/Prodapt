package edu.training.hibmappingdemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.training.hibmappingdemo.model.Book;
import edu.training.hibmappingdemo.model.Student;

public class FeatchDemo {

	public static void main(String[] args) {
		
Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Book.class);
        
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Student s = (Student) session.get(Student.class, 101);
        
        System.out.println(s.getSname());
//        List<Book> l = s.getBook();
//        for(Book b :l)
//        {
//        	System.out.println(b.getBookName());
//        }
        
        
		
	}
}
