package org.example;
import org.example.dao.Student;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            studentList.add(new Student(sc.nextInt(), sc.next(), sc.nextInt()));
        }
        System.out.println("1. Sort according to names in ascending order\n2. Sort according to marks in descending order\nEnter choice : ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
            {
                Comparator<Student> stuname = Comparator.comparing(Student::getSname);
                Set<Student> studentSet = new TreeSet<>(stuname);
                studentSet.addAll(studentList);
                List<Student> studentList1 = new ArrayList<>(studentSet);
                System.out.println(studentList1);
                break;
            }

            case 2:
            {
                Comparator<Student> stuid = Comparator.comparing(Student::getSid).reversed();
                Set<Student> studentSet = new TreeSet<>(stuid);
                studentSet.addAll(studentList);
                List<Student> studentList1 = new ArrayList<>(studentSet);
                System.out.println(studentList1);
                break;
            }

            default:
                System.out.println("Invalid");

        }
    }
}

