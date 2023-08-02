package org.example;
import org.example.Collections.StudentCollections;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Student s=new Student();
        int choice;
        Main m = new Main();
        Scanner sc = new Scanner(System.in);

        Set<StudentCollections> set = new HashSet<>();
        System.out.println();
        int count = 0;
       /* while(count<3)
        {
            int sid=sc.nextInt();
            String sname=sc.next();
            int marks=sc.nextInt();
            set.add(new StudentCollections(sid,sname,marks));
            count++;
        }
        System.out.println(set);*/
StudentCollections s1=new StudentCollections(1, "ram", 45);
StudentCollections s2=new StudentCollections(2, "raji", 56);
StudentCollections s3=new StudentCollections(3, "ramya", 57);
StudentCollections s4=new StudentCollections(5, "raman", 12);
StudentCollections s5=new StudentCollections(10, "rakesh", 90);
        List<StudentCollections> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s5);
        list.add(s4);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s5);
        list.add(s4);
        Set <StudentCollections> set1=new LinkedHashSet<>(list);
        List<StudentCollections> list1 = new ArrayList<>(set1);
        System.out.println(set1);

        System.out.println("-------------------");
        System.out.println(list1);
do {
        System.out.println("choices are:\n1.Sort by Name\n2.Sort by marks");
        System.out.println("Enter the choice");
         choice = sc.nextInt();
        switch (choice) {
            case 1:
                m.nameSort(list1);
                break;
            case 2:
                m.marksSort(list1);
                break;
        }}while(choice<=2);
    }
public void nameSort(List<StudentCollections> list1) {
    Collections.sort(list1, new Comparator<StudentCollections>() {
        @Override
        public int compare(StudentCollections obj1, StudentCollections obj2) {
            if(obj1.getSname().compareTo(obj2.getSname())<0)
            {
                return -1;
            }
            else if(obj1.getSname().compareTo(obj2.getSname())>0)
            {
                return 1;
            }
            else {
                return 0;
            }
        }
    });
    System.out.println(list1);
}
public void   marksSort(List<StudentCollections> list1)
{
    Collections.sort(list1,new Comparator<StudentCollections>() {
        @Override
     public int compare(StudentCollections obj1,StudentCollections obj2) {
            if (obj1.getMarks()<(obj2.getMarks())) {
                return 1;
            } else if (obj1.getMarks()>(obj2.getMarks())) {
                return -1;
            } else {
                return 0;
            }
        }
    });
    System.out.println(list1);
}


    }
