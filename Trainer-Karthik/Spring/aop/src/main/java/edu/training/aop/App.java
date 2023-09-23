package edu.training.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.training.aop.model.PaymentGateway;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        PaymentGateway pg = (PaymentGateway)context.getBean("pg");
        
        pg.makePayment();
    }
}
