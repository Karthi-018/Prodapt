package edu.training.hibmappingdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.training.hibmappingdemo.model.Book;
import edu.training.hibmappingdemo.model.Student;

public class ManyToOneDemo {
	
public static void main(String[] args) {
		
		Book java = new Book();
    	java.setBookID(1);
    	java.setBookName("JAVA");
    	
    	Book python = new Book();
    	python.setBookID(2);
    	python.setBookName("PYTHON");
    	
    	Book hib = new Book();
    	hib.setBookID(2);
    	hib.setBookName("HIBERnate");
    	
    	Student karthik = new Student();
    	karthik.setSid(101);
    	karthik.setSname("Karthik");
    	karthik.setMarks(85);
    	karthik.getBook().add(java);
    	
    	Student yaazhini = new Student();
		yaazhini.setSid(102);
		yaazhini.setSname("Yaazhini");
		yaazhini.setMarks(85);
		karthik.getBook().add(java);
    	
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Book.class);
        
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(java);
        session.save(python);
        session.save(karthik);
       
        Book b = (Book) session.get(Book.class, 1);
        b.setStudent(karthik);
        session.update(b);
        
        Book b1 = (Book) session.get(Book.class, 2);
        b1.setStudent(karthik);
        session.update(b1);
        
        tx.commit();
        session.close();
	}

}
