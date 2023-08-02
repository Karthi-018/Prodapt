package org.example;

import org.example.dao.Employee;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Set<Employee> employeeList = new HashSet<>();

      Employee e1 =  new Employee(111,"AAA","BBB");
        Employee e2 =  new Employee(112,"CCC","DDD");
        Employee e3 =  new Employee(113,"EEE","FFF");
        Employee e4 =  new Employee(114,"GGG","HHH");
        Employee e5 =  new Employee(115,"III","JJJ");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e3);
        employeeList.add(e1);

            List<Employee> empList = new ArrayList<>();
            empList.addAll(employeeList);
//        for(int i=0;i<10;i++)
//        {
//            employeeList.add(new Employee((100+(i+1)),"Employee"+(i+1),"Department"+(i+1)));
//        }

        employeeList.forEach(System.out::println);

        System.out.println("**********************************************");
        System.out.println("Enter your choice");
        System.out.println("1 -> Sort by Employee name in Aes Order");
        System.out.println("2 -> Sort by Employee Dept in Des Order");
        int choice = new Scanner(System.in).nextInt();

        switch (choice)
        {
            case 1 : empList.sort((t1, t2) -> (t1.geteName().compareTo(t2.geteName())));
                empList.forEach(System.out::println);
                break;
            case 2 : empList.sort((t1, t2) -> (t1.getEid()<t2.getEid())?-1:(t1.getEid()>t2.getEid())?1:0);
                empList.forEach(System.out::println);
                break;
        }

    }
}