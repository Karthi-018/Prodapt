package org.example;

import java.util.Comparator;

public class Name_Comparator implements Comparator<StudentDetailsPOJO> {
    @Override
    public int compare(StudentDetailsPOJO studentDetailsPOJO, StudentDetailsPOJO t1) {
        return studentDetailsPOJO.getStuName().compareTo(t1.getStuName());
    }
}
