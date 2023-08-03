package org.example;
import org.example.dao.Student;


import java.util.*;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static Set<Student> stuArr=new HashSet<Student>();
    public static List <Student> RRR = new ArrayList<>();
    public static void switchChoice(int choice)
    {
        switch(choice){
            case 1:
                RRR.sort(new Comparator<Student>() {
                    public int compare(Student O1, Student O2) {
                        return O1.getSname().compareTo(O2.getSname());
                    }
                });
                RRR.forEach(System.out::println);
                break;
            case 2:
                RRR.sort(new Comparator<Student>(){
                    public int compare (Student O1, Student O2)
                    {
                        if (O1.getMarks()<O2.getMarks())
                        {
                            return 1;
                        }
                        else if(O1.getMarks()>O2.getMarks())
                        {
                            return -1;
                        }
                        else
                        {
                            return 0;
                        }
                    }
                });
                RRR.forEach(System.out::println);
                break;
        }
    }

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            int sid=s.nextInt();
            String Sname=s.next();
            int marks=s.nextInt();

            stuArr.add(new Student(sid,Sname,marks));

        }
        RRR.addAll(stuArr);
        System.out.print("Enter the choice:");
        int choice=s.nextInt();
        switchChoice(choice);
    }
}
