package edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	 
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        AndroidPhone aphone = context.getBean(AndroidPhone.class);
       
        aphone.calling("XYZ", 9876543210L);
        aphone.playingSong("SPB Hits");
        
        System.out.println("My AndroidPhone is manifactrued with "+aphone.getCpu()+"");
    }
}
