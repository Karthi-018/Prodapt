package org.example;
import java.util.*;
public class Main_StudentDetails {

    public static void main(String[] args) {
        ArrayList<StudentDetailsPOJO> data;
        data =new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            data.add(new StudentDetailsPOJO(i+100,"student"+i,590+i));
        }
        data.add(new StudentDetailsPOJO(111,"hari",600));
        data.add(new StudentDetailsPOJO(115,"rags",597));
        data.add(new StudentDetailsPOJO(114,"vibesss",699));
        data.add(new StudentDetailsPOJO(100,"cooker",700));
        System.out.println("Before sorting");
        System.out.println(data);
        System.out.println("After sorting");
        //data.forEach(System.out::println);
        System.out.println("Sorting by ID");
        Collections.sort(data,new ID_Comparator());
        data.forEach(System.out::println);
        System.out.println("Sorting by NAME");
        Collections.sort(data, new Name_Comparator());
        data.forEach(System.out::println);




    }
}
