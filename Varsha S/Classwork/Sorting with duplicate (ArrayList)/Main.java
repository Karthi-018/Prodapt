package org.example;

import org.example.dao.Employee;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            employeeList.add(new Employee(sc.nextInt(), sc.next(), sc.nextInt()));
        }
        System.out.println("1. Sort according to names in ascending order\n2. Sort according to marks in descending order\nEnter choice : ");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
            {
                employeeList.sort(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee employee, Employee t1) {
                        return employee.getEname().compareTo(t1.getEname());
                    }
                });
                System.out.println(employeeList);
                break;
            }

            case 2:
            {
                employeeList.sort(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee employee, Employee t1) {
                        if (employee.getSalary()< t1.getSalary()) return 1;
                        else if(employee.getSalary()> t1.getSalary()) return -1;
                        else return 0;
                    }
                });
                System.out.println(employeeList);
                break;
            }

            default:
                System.out.println("Invalid");
        }
    }
}

