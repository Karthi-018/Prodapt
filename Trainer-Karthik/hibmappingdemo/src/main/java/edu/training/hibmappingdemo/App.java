package edu.training.hibmappingdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.training.hibmappingdemo.model.Book;
import edu.training.hibmappingdemo.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Book java = new Book();
    	java.setBookID(2);
    	java.setBookName("PYTHON");
    	
    	Student karthik = new Student();
    	karthik.setSid(103);
    	karthik.setSname("PAVI");
    	karthik.setMarks(85);
//    	karthik.setBook(java);
    	
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Book.class);
        
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(java);
        session.save(karthik);
        
        tx.commit();
        session.close();
    }
}
