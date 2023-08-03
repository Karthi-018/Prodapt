import java.util.Scanner;

class Quiz{

    public void questions(int ch){
        Scanner s=new Scanner(System.in);
        int countans=0;
        switch (ch){
            case 1:
                System.out.println("***************Lets Begin**********************");

                System.out.println("Which of the following for loop declaration is not valid");
                System.out.println("1: for ( int i = 99; i >= 0; i / 9 )");
                System.out.println("2: for ( int i = 7; i <= 77; i += 7 )");
                System.out.println("3: for ( int i = 20; i >= 2; - -i )");
                System.out.println("4: for ( int i = 2; i <= 20; i = 2* i )");
                System.out.print("Enter your choice : ");
                String  a=s.next();          
                if(a.equals("1")){
                    countans++;
                }
                System.out.println("The ______ keyword is used to call the constructor of the parent class");
                System.out.println("1: this");
                System.out.println("2: parent class name");
                System.out.println("3: super");
                System.out.println("4: parent");
                System.out.print("Enter your Option : ");
                String  b=s.next();  
                if(b.equals("3")){
                    countans++;
                }
                System.out.println("Java permits a class to extend only one other class directly. This is called __________");
                System.out.println("1: Hierarchical inheritance");
                System.out.println("2: single inheritance");
                System.out.println("3: multilevel inheritance");
                System.out.println("4: hybrid inheritance");
                System.out.print("Enter your Option : ");
                String  c=s.next();
                if(b.equals("2")){
                    countans++;
                }
                System.out.println("Which of the following options is a valid class identifier in Java");
                System.out.println("1: creditcard");
                System.out.println("2: creditCard");
                System.out.println("3: CreditCard");
                System.out.println("4: 1creditCard");
                System.out.print("Enter your Option : ");
                String  d=s.next();
                if(b.equals("3")){
                    countans++;
                }
                System.out.println("_______ refers to individuals and organizations that develop, innovate, and use the Java technology");
                System.out.println("1: Java Specification Requests");
                System.out.println("2: Java Development kit");
                System.out.println("3: Java Virtual Machine");
                System.out.println("4: Java community");
                System.out.print("Enter your Option : ");
                String  e=s.next();
                if(b.equals("4")){
                    countans++;
                }
                System.out.println("what is the answer of 4+2");
                System.out.println("1: 4");
                System.out.println("2: 6");
                System.out.println("3: 1");
                System.out.println("4: 9");
                System.out.print("Enter your Option : ");
                String  f=s.next();
                if(b.equals("1")){
                    countans++;
                }
                System.out.println("Which of the following statement is incorrect regarding Java");
                System.out.println("1: Java is available free of cost");
                System.out.println("2: OpenJDK is the open-source implementation of Java");
                System.out.println("3: The JCP develops new Java standards");
                System.out.println("4: The JDK compiler converts bytecode to Java source code");
                System.out.print("Enter your Option : ");
                String  g=s.next();
                if(b.equals("3")){
                    countans++;
                }
                System.out.println("what is the answer of 4+2");
                System.out.println("1: 4");
                System.out.println("2: 6");
                System.out.println("3: 1");
                System.out.println("4: 9");
                System.out.print("Enter your Option : ");
                String  h=s.next();
                if(b.equals("1")){
                    countans++;
                }
                System.out.println("Which of the following import statements is used by default in all the Java applications?");
                System.out.println("1: import java.lang.*;");
                System.out.println("2: import java.util.*;");
                System.out.println("3: import java.awt.*;");
                System.out.println("4: Import java.net.*;");
                System.out.print("Enter your Option : ");
                String  i=s.next();
                if(b.equals("1")){
                    countans++;
                }
                System.out.println("What will be the output of the following program?");
                System.out.println("1: No error");
                System.out.println("2: Constructor is not defined properly");
                System.out.println("3: Method is not defined properly");
                System.out.println("4: Extra parentheses");
                System.out.print("Enter your Option : ");
                String  j=s.next();
                if(b.equals("1")){
                    countans++;
                }


        }
        System.out.println("The total number of correct answers is : "+countans);
    }
    public static void main(String []a){
        System.out.print("Press 1 to start : ");
        Scanner sc= new Scanner(System.in);
        int ch=sc.nextInt();
        Quiz q=new Quiz();
        q.questions(ch);

    }
}