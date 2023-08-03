package org.example;
import org.example.dao.Student;


import  java.util.*;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Set<Student> data = new HashSet<>();

        Student s1=new Student(100,"AAA",67);
        Student s2=new Student(101,"BBB",99);
        Student s3=new Student(102,"CCC",94);
        Student s4=new Student(103,"DDD",76);
        Student s5=new Student(104,"EEE",83);
        Student s6=new Student(105,"FFF",100);
        Student s7=new Student(106,"GGG",55);
        Student s8=new Student(107,"HHH",71);
        Student s9=new Student(108,"III",42);
        Student s10=new Student(109,"JJJ",58);

        data.add(s1);
        data.add(s2);
        data.add(s3);
        data.add(s4);
        data.add(s5);
        data.add(s6);
        data.add(s7);
        data.add(s8);
        data.add(s9);
        data.add(s10);


        ArrayList<Student> dataa=new ArrayList();

        dataa.addAll(data);
        data.forEach(System.out::println);


        System.out.println("1--> Sort by student name list in Ascending order");
        System.out.println("2--> Sort by student marks in descending order");
        System.out.println("Enter the choice of order : ");
        Scanner sc= new Scanner(System.in);
        int ch =sc.nextInt();

        switch(ch){
            case 1:
                dataa.sort(new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        if (s1.marks>s2.marks){
                            return -1;
                        }
                        else if (s1.marks<s2.marks) {
                            return 1;
                        }
                        else {
                            return 0;
                        }
                    }
                });
                System.out.println("the sorted array is  :");
                System.out.println(dataa);
            case 2:
                dataa.sort(new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s1.sname.compareTo(s2.sname);
                    }
                });
                System.out.println(dataa);
        }
    }

}