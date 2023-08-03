import java.util.*;

public class Quiz {
    Scanner sc=new Scanner(System.in);

    public static void main(String args[]) {
        ArrayList<Pojo_Quiz> data = new ArrayList<>();
        data.add(new Pojo_Quiz("1)Which of the following option leads to the portability and security of Java?\na.Bytecode is executed by JVM\nb.The applet makes the Java code secure and portable\nc.Use of exception handling\nd.Dynamic binding between objects\n", 'a', 'b'));
        data.add(new Pojo_Quiz("2)Number of primitive data types in Java are?\na.7\nb.8\nc.6\nd.9",'b','b'));
        data.add(new Pojo_Quiz("3)Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard\n",'c','c'));
        data.add(new Pojo_Quiz("4)The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent\n",'c','c'));
        data.add(new Pojo_Quiz("5)Which concept shows parent child relationship among classes in java? \na.Inheritance\nb.Abstraction\nc.Polymorphism\nd.Encapsulation\n",'a','a'));
        data.add(new Pojo_Quiz("6)Which of the following option leads to the portability and security of Java?\na.Bytecode is executed by JVM \nb.The applet makes the Java code secure and portable\nc.Use of exception handling\nd.Dynamic binding between objects\n", 'a', 'b'));
        data.add(new Pojo_Quiz("7)Number of primitive data types in Java are?\na.7\nb.8\nc.6\nd.9\n",'b','b'));
        data.add(new Pojo_Quiz("8)Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard\n",'c','c'));
        data.add(new Pojo_Quiz("9)The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent\n",'c','c'));
        data.add(new Pojo_Quiz("10)Which concept shows parent child relationship among classes in java? \na.Inheritance\nb.Abstraction\nc.Polymorphism\nd.Encapsulation\n",'a','a'));


        Quiz_Display obj=new Quiz_Display();
        obj.display(data);
    }

}

