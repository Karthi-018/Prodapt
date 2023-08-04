package org.example.dao;

import java.util.*;

// Comparator is an interface used to compare data.(All methods in interface are public and abstract).
//Comparator is used to compare between 2 objects and comparable for 1 object.

public class AddStudents implements Comparator {
    public static void main(String[] args)
    {

        //To eliminate duplication of objects,we use set.
        Set<Student> studentset = new HashSet<Student>();

        studentset.add(new Student(1,"abc",75));
        studentset.add(new Student(2,"abc",98));
        studentset.add(new Student(3,"ghi",45));
        studentset.add(new Student(4,"jkl",66));
        studentset.add(new Student(5,"mno",43));

        //Set is converted to ArrayList to perform sorting.
        List<Student> stulist = new ArrayList<>();
        stulist.addAll(studentset);

//        for(Object i:studentset)
//        {
//            System.out.println(i);
//        }


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value");
        System.out.println("1: Sort by Student name in Aes Order");
        System.out.println("2: Sort by Student id in Des Order");
        int user_val = sc.nextInt();

        switch (user_val)
        {
            case 1 : stulist.sort((t1, t2) -> (t1.getSname().compareTo(t2.getSname())));
                stulist.forEach(System.out::println);
                break;
            case 2 : stulist.sort((t1, t2) -> (t1.getSid()<t2.getSid())?-1:(t1.getSid()>t2.getSid())?1:0);
                stulist.forEach(System.out::println);
                break;
        }

    }

    //Interface should be overridden for implementing.
    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }

}
