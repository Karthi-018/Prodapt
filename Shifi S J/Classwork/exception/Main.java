package org.example;

import java.util.*;


public class Main
{
    public static void main(String[] args)
    {

        Set<StudentClass> studentList = new HashSet<>();

        StudentClass s1 =  new StudentClass(111,"AAA",45);
        StudentClass s2 =  new StudentClass(112,"CCC",78);
        StudentClass s3 =  new StudentClass(113,"EEE",98);
        StudentClass s4 =  new StudentClass(114,"GGG",75);
        StudentClass s5 =  new StudentClass(115,"III",88);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);


        List<StudentClass> stuList = new ArrayList<>();
        studentList.addAll(studentList);
    //for(int i=0;i<10;i++)
      //{
        //    studentList.add(new StudentClass((100+(i+1)),"Students"+(i+1),+(i+1)));
    //}
        studentList.forEach(System.out::println);

        System.out.println("Enter your choice");
        System.out.println("1 -> Sort by Students name in Ascending Order");
        System.out.println("2 -> Sort by Students Marks in Descending Order");
        int choice = new Scanner(System.in).nextInt();

        switch (choice)
        {
            case 1 : stuList.sort((n1, n2) -> (n1.sName().compareTo(n2.sName())));
                studentList.forEach(System.out::println);
                break;
            case 2 : stuList.sort((n1, n2) -> (n1.getStuID()<n2.getStuID())?-1:(n1.getStuID()>n2.getStuID())?1:0);
                studentList.forEach(System.out::println);
                break;
        }

    }
}
