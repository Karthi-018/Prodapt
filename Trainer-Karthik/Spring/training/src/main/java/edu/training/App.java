package edu.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.training.model.AndroidPhone;
import edu.training.model.SmartPhone;
import edu.training.model.SpringConfig;
import edu.training.model.iPhone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	AndroidPhone aphone = context.getBean(AndroidPhone.class);
        aphone.calling("ABC", 9087654321L);
        aphone.playingSong("AR Songs");
        
//        aphone.setCpu("Helion");
        
        System.out.println("My AndroidPhone is manifactrued with "+aphone.getCpu()+"");
        
        System.out.println("*****************************************");
        
//        SmartPhone iphone = (SmartPhone) context.getBean("iphone");
//        iphone.calling("ABC", 9087654321L);
//        iphone.playingSong("AR Songs");
//        System.out.println("My iPhone is manifactrued with "+iphone.getCpu()+"");
        
        
    }
}
