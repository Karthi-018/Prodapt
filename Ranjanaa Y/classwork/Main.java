package org.example;
import org.example.Emp.Student;

import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.out.println();
        Set<Student> data = new HashSet<>();
        Main m = new Main();
        Student s1 = new Student(1,"A",90);
        Student s2 = new Student(2,"B",99);
        Student s3 = new Student(3,"C",93);
        Student s4 = new Student(4,"D",88);
        Student s5 = new Student(5,"E",77);

        Scanner sc = new Scanner(System.in);

        data.add(s1);
        data.add(s2);
        data.add(s3);
        data.add(s4);
        data.add(s5);
        System.out.println(data);
        ArrayList<Student> l = new ArrayList<>();
        l.addAll(data);

        System.out.println("Enter 1 to sort by name: ");
        System.out.println("Enter 2 to sort by name: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1 :
                l.sort(new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        if(s1.marks>s2.marks)
                        {
                            return -1;
                        } else if (s1.marks< s2.marks)
                        {
                            return 1;
                        }
                        else {
                            return 0;
                        }
                    }
                });
                System.out.println("The sorted list of mark is"+l);
            case 2 : l.sort(new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {

                    return s1.name.compareTo(s2.name);
                }
            });
                System.out.println("The sorted list of name is"+l);
        }
    }
}