package edu.training.mavenDemo;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Employee emp=new Employee("ABC",5000);
        Configuration cgf = new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory sf =cgf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx =session.beginTransaction();
        session.save(emp);
        tx.commit();
        session.close();        
    }
}
