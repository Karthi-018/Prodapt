package edu.training.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

import edu.training.jpademo.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee e = new Employee();
        e.setEid(102);
        e.setEname("XYZ");
        e.setSalary(6000);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        
        EntityManager em = emf.createEntityManager();
         em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        
    }
}
