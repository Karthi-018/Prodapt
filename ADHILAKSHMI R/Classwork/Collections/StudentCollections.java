package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {


        Set<Student> S= new HashSet<>();

        Student S1 = new Student(1, "adhi", 105);
        Student S2 = new Student(2, "priya", 101);
        Student S3 = new Student(3, "dhivya", 100);
        Student S4 = new Student(4, "Nivi", 104);

        S.add(S1);
        S.add(S2);
        S.add(S3);
        S.add(S4);
        S.add(S1);
        S.add(S2);

        List<Student> stuList = new ArrayList<>();
        stuList.addAll(S);

      S.forEach(System.out::println);

        System.out.println("**********************************************");
        System.out.println("Enter your choice");
        System.out.println("1 -> Sort by Student Aes Order");
        System.out.println("2 -> Sort by Student Id in Des Order");
        System.out.println("3 -> Sort by student marks in Aes Order");
        System.out.println("4 -> Sort by student marks in Des order");
        System.out.println("5 -> Sort by student Id in Des order");
        int choice = new Scanner(System.in).nextInt();

        switch (choice)
        {
            case 1 :
                stuList.sort((t1, t2) -> (t1.getName().compareTo(t2.getName())));
                stuList.forEach(System.out::println);
                break;
            case 2 : stuList.sort((t1, t2) -> (t1.getId()<t2.getId())?-1:(t1.getId()>t2.getId())?1:0);
                stuList.forEach(System.out::println);
                break;
            case 3 : stuList.sort((t1, t2) -> (t1.getMarks()<t2.getMarks())?-1:(t1.getMarks()>t2.getMarks())?1:0);
                stuList.forEach(System.out::println);
                break;
            case 4: stuList.sort((t1, t2) -> (t1.getMarks()>t2.getMarks())?-1:(t1.getMarks()<t2.getMarks())?1:0);
                stuList.forEach(System.out::println);
                break;
            case 5:stuList.sort((t1,t2)->(t1.getId()> t2.getId())?-1:(t1.getId()< t2.getId())?1:0);
                 stuList.forEach(System.out::println);
                 break;
        }

    }
}