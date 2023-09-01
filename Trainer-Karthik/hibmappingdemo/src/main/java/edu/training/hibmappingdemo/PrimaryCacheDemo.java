package edu.training.hibmappingdemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.training.hibmappingdemo.model.Book;
import edu.training.hibmappingdemo.model.Student;

public class PrimaryCacheDemo {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Book.class);
        
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("select sname,marks from Student");
//        Student s = (Student)q.uniqueResult();
       
        List<Object[]> ss = (List<Object[]>)q.list();
        for(Object[] s : ss)
        System.out.println(s[0]+" "+s[1]);
        
        session.close();
        
        
//        Session session1 = sf.openSession();
//		
//        Student s1 = (Student) session1.get(Student.class, 101);
//        Book b1 = (Book) session1.get(Book.class, 1);
//        System.out.println(b1.getBookName());
//        
//        System.out.println(s1.getSname());
//        
//        session1.close();
//        
//        Session session2 = sf.openSession();
//		
//        Student s2 = (Student) session2.get(Student.class, 101);
////        Book b2 = (Book) session.get(Book.class, 1);
////        System.out.println(b2.getBookName());
//        
//        System.out.println(s2.getSname());
//        
//        session2.close();
	}

}
