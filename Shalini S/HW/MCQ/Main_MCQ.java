import java.util.*;
public class Main_MCQ {
    public static void main(String args[]){
        int x=1;
        char answer;
        Scanner sc=new Scanner(System.in);
        char arr[]=new char[10];
        switch(x){
            case 1: System.out.println("1)Which of the following option leads to the portability and security of Java?\n" +
                    "\n" +
                    "a.Bytecode is executed by JVM\n" +
                    "b.The applet makes the Java code secure and portable\n" +
                    "c.Use of exception handling\n" +
                    "d.Dynamic binding between objects");
                    answer=sc.next().charAt(0);
                    arr[0]=answer;

            case 2:System.out.println("2) Which of the following is not a Java features?\n" +
                    "\n" +
                    "a.Dynamic\n" +
                    "b.Architecture Neutral\n" +
                    "c.Use of pointers\n" +
                    "d.Object-oriented");
                    answer=sc.next().charAt(0);
                    arr[1]=answer;

            case 3:System.out.println("3)_____ is used to find and fix bugs in the Java programs.\n" +
                    "\n" +
                    "a.JVM\n" +
                    "b.JRE\n" +
                    "c.JDK\n" +
                    "d.JDB");
                    answer=sc.next().charAt(0);
                    arr[2]=answer;

            case 4:System.out.println("4)What is the return type of the hashCode() method in the Object class?\n" +
                    "\n" +
                    "a.Object\n" +
                    "b.int\n" +
                    "c.long\n" +
                    "d.void");
                    answer=sc.next().charAt(0);
                    arr[3]=answer;

            case 5:System.out.println("5)In which process, a local variable has the same name as one of the instance variables?\n" +
                    "\n" +
                    "a.Serialization\n" +
                    "b.Variable Shadowing\n" +
                    "c.Abstraction\n" +
                    "d.Multi-threading");
                    answer=sc.next().charAt(0);
                    arr[4]=answer;

            case 6:System.out.println("6)Which of the following is true about the anonymous inner class?\n" +
                    "\n" +
                    "a.It has only methods\n" +
                    "b.Objects can't be created\n" +
                    "c.It has a fixed class name\n" +
                    "d.It has no class name");
                    answer=sc.next().charAt(0);
                    arr[5]=answer;

            case 7:System.out.println("7)An interface with no fields or methods is known as a ______.\n" +
                    "\n" +
                    "a.Runnable Interface\n" +
                    "b.Marker Interface\n" +
                    "c.Abstract Interface\n" +
                    "d.CharSequence Interface");
                    answer=sc.next().charAt(0);
                    arr[6]=answer;

            case 8:System.out.println("8)Which of the following is a marker interface?\n" +
                    "\n" +
                    "a.Runnable interface\n" +
                    "b.Remote interface\n" +
                    "c.Readable interface\n" +
                    "d.Result interface");
                    answer=sc.next().charAt(0);
                    arr[7]=answer;

            case 9:System.out.println("9)Which keyword is used for accessing the features of a package?\n" +
                    "\n" +
                    "a.package\n" +
                    "b.import\n" +
                    "c.extends\n" +
                    "d.export");
                    answer=sc.next().charAt(0);
                    arr[8]=answer;
            case 10:System.out.println("10)What is meant by the classes and objects that dependents on each other?\n" +
                    "\n" +
                    "a.Tight Coupling\n" +
                    "b.Cohesion\n" +
                    "c.Loose Coupling\n" +
                    "d.None of the above");
                    answer=sc.next().charAt(0);
                    arr[9]=answer;
        }
        Marks obj=new Marks();
        System.out.println("Your total score is:");
        int y=obj.evaluate(arr);
        System.out.println(y);
        if(y>=6){
            System.out.println("**** Congratulation !!!!! You have cleared the test !! ****");
        }
        else{
            System.out.println("**** Better luck next time ****");
        }
    }
}
