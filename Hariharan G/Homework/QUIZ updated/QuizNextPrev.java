package assignment;

import java.util.Scanner;

public class QuizNextPrev {

    Quiz arr[]=new Quiz[10];
    static Scanner sc=new Scanner(System.in);
    public void questions(){

        arr[0]=new Quiz(1,"Which of the following statements is correct about inner classes\n","1.\n" + "An inner class can be declared inside a method block called local classes\n","2.\n" + "A static nested class is considered as an inner class\n" ,"3.\n" + "An inner class does not have access to the private members of the outer class\n","4.\n" + "An inner class cannot be declared inside a method",1);
        arr[1]=new Quiz(2,"Which of the following statements is correct regarding static variables and methods\n","1.\n" + "Static methods cannot retrieve object references\n" ,"2.\n" + "Static variables are limited to a single copy per JVM\n","3.\n" + "Static variables cannot contain shared data\n" ,"4.\n" + "Static methods store data in local variables",2);
        arr[2]=new Quiz(3,"The ______ keyword is used to call the constructor of the parent class\n","1.\n" + "this\n","2.\n" + "parent class name\n" ,"3.\n" + "super\n","4.\n" + "parent",3);
        arr[3]=new Quiz(4,"Which of the following statements is correct regarding static variables and methods\n","1.\n" + "Static methods cannot retrieve object references\n" ,"2.\n" + "Static variables are limited to a single copy per JVM\n" ,"3.\n" + "Static variables cannot contain shared data\n" ,"4.\n" + "Static methods store data in local variables",2);
        arr[4]=new Quiz(5,"How many times will “Interviewbit” be printed\n", "1.\n" + "8\n" ,"2.\n" + "9\n" ,"3.\n" + "10\n" ,"4.\n" + "11",3);
        arr[5]=new Quiz(6,"Which of the following options shows the correct implementation of method overloading\n" , "1.\n" + "public int print (int i);\n" + "public void print (int f);\n" , "2.\n" + "public void dostuff(float i);\n" + "public void dostuff(double i);\n" , "3.\n" + "public void show();\n" + "public string show();\n" , "4.\n" + "public void disp (int i);\n",2);
        arr[6]=new Quiz(7,"Which of the following import statements is used by default in all the Java applications?\n" , "1.\n" + "import java.lang.*;\n" , "2.\n" + "import java.util.*;\n" , "3.\n" + "import java.awt.*;\n" , "4.\n" + "Import java.net.*;",1);
        arr[7]=new Quiz(8,"OOP allows a class to make use of another class. This kind of relationship is called _________\n" , "1.\n" + "Generalization\n" , "2.\n" + "Utilization\n" , "3.\n" + "Composition\n" , "4.\n" + "Instantiation",2);
        arr[8]=new Quiz(9,"Which of the following is FALSE about arrays in Java\n" , "1.\n" + "A java array is always an object\n" , "2.\n" + "Length of array can be changed after creation of array\n" , "3.\n" + "Arrays in Java are always allocated on heap\n" , "4.\n" + "None of this",2);
        arr[9]=new Quiz(10,"_______ refers to individuals and organizations that develop, innovate, and use the Java technology\n" , "1.\n" + "Java Specification Requests\n" , "2.\n" + "Java Development kit\n" , "3.\n" + "Java Virtual Machine\n" , "4.\n" + "Java community\n",4);
    }
    int total=0;
    int ca;
    String c;
    int correctAns[]=new int[10];
    public void game()
    {
        for(int i=0;i<10;) {
            //System.out.println(i);
            if (i == 0) {
                System.out.println(arr[i]);
                System.out.println("Enter choice");
                correctAns[i] = sc.nextInt();
//                if (ca == arr[i].getCorrectAns()) {
//                    total += 1;
//                }
                System.out.println("click + for next question ");
                c = sc.next();
                if (c.equals("+")) {
                    i+=1;
                }
            }
            else if(i>0 && i<=9){
                System.out.println(arr[i]);
                System.out.println("Enter choice");
                correctAns[i]=sc.nextInt();
//                if(ca==arr[i].getCorrectAns()){
//                    total+=1;
//                }
                System.out.println("click + for next question\nclick - for previous question\n");
                c=sc.next();
//                System.out.println("click + for next question ");
//                c=sc.next();
                if(i==9){
                    if(c.equals("+")){
                        break;
                    }
                    else {
                        i-=1;
                    }
                }
                else if(c.equals("+")){
                    i+=1;
                }
                else{
                    i-=1;

                }
            }


        }
//        System.out.println("TOTAL IS: "+ total);

    }


    public void displayMarks()
    {
        for(int i=0;i<correctAns.length;i++){
            if(correctAns[i]==arr[i].getCorrectAns()){
                total+=1;
            }
        }
        System.out.println("TOTAL IS: "+ total);


    }




    public static void main(String[] args) {
        //Quiz_Main_POJO qm=new Quiz_Main_POJO();
        QuizNextPrev qnp=new QuizNextPrev();
        qnp.questions();
        qnp.game();
        qnp.displayMarks();

    }
}
