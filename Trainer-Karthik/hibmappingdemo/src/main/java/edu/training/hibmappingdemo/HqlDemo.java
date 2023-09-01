package edu.training.hibmappingdemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.training.hibmappingdemo.model.Book;
import edu.training.hibmappingdemo.model.Student;

public class HqlDemo {
		
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Book.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Book b = (Book) s.get(Book.class, 1);
		s.delete(b);
		
//		Student stu = (Student)s.get(Student.class, 102);
//		s.delete(stu);
		
//		stu.setMarks(95);
//		s.update(stu);
		tx.commit();
//		Student stu1 = (Student)s.get(Student.class, 102);
//		System.out.println(stu1);
//		System.out.println(stu);
		
//		Query q = s.createQuery("update Student set marks=:m where sid=:i");
//		q.setInteger("m", 90);
//		q.setInteger("i", id);
//		int temp = q.executeUpdate();
		
//		q.setInteger("temp", id);
//		Object[] stu = (Object[])q.uniqueResult();
//		System.out.println(stu[0]+" "+stu[1]);
//		List<Student> stu = (List<Student>)q.list();
//		for(Student s1 : stu)
//		System.out.println(s1.getSname());
		
//		List<Object[]> so = (List<Object[]>) q.list();
//		
//		for(Object[] o : so)
//			System.out.println(o[0]+" "+o[1]);
		
	}

}
