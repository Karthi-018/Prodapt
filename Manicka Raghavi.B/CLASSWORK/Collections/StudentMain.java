package org.example;
import java.util.*;
public class StudentMain
{
    ArrayList<StudentPojo> StudentArray = new ArrayList<>();

    Set<StudentPojo> StudentSet=new HashSet<>();

    ArrayList<Integer> StudentId = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    void create()
    {
        StudentPojo s1 = new StudentPojo(101 , "Student" + (90-1), 91);
        StudentPojo s2 = new StudentPojo(102 , "Student" + (90-2), 92);
        StudentPojo s3 = new StudentPojo(103 , "Student" + (90-3), 93);
        StudentPojo s4 = new StudentPojo(104 , "Student" + (90-4), 94);
        StudentPojo s5 = new StudentPojo(105 , "Student" + (90-5), 95);

        StudentSet.add(s1);
        StudentSet.add(s2);
        StudentSet.add(s3);
        StudentSet.add(s4);
        StudentSet.add(s5);
        StudentSet.add(s1);
        StudentSet.add(s2);

        StudentArray.addAll(StudentSet);

        for(StudentPojo s:StudentArray)
            StudentId.add(s.getId());

        StudentArray.forEach(System.out::println);
    }



    void createDetails(int id)
    {   int flag=0;
        for(Integer i:StudentId)
        {
            if(i==id)
            {
               System.out.print("Cannot create student details-there is duplication of details");
               flag=1;
               break;
            }
        }
        if(flag==0)
        {
            StudentId.add(id);
            System.out.println("Enter the Student Details");
            System.out.println("Student Name-");
            String name=sc.next();
            System.out.println("Student Mark-");
            int mark=sc.nextInt();
            System.out.println("The Details added successfully");
            StudentArray.add(new StudentPojo(id,name,mark));
        }

    }

    public static void main (String[] args)
    {
        StudentMain object=new StudentMain();
        object.create();

        Comparator<StudentPojo> com= (obj1, obj2) ->
        {
            if(obj1.getName().compareTo(obj2.getName()) >=0)
                return 1;
            else
                return -1;
        };
        Comparator<StudentPojo> obj=new Comparator<StudentPojo>()
        {

            @Override
            public int compare(StudentPojo obj1, StudentPojo obj2)
            {
                if(obj1.getId()>obj2.getId())
                    return -1;
                else
                    return 1;
            }
        };

        System.out.println("Enter \n1-Create New Student Details \n2-Sort the Details using Name \n3-Sort the Details using Mark(Descending): ");
        int n=sc.nextInt();
        switch (n)
        {
            case 1: System.out.println("Student Id-");
                    object.createDetails(sc.nextInt());
                    break;

            case 2: System.out.println("Sorting the details using Name");
                    object.StudentArray.sort(com);
                    object.StudentArray.forEach(System.out::println);
                    break;

            case 3: System.out.println("Sorting the details using Marks");
                    object.StudentArray.sort(obj);
                    object.StudentArray.forEach(System.out::println);
                    break;

            default:System.out.println("Wrong Choice");

        }



    }
    }
