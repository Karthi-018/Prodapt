package org.example;

import java.util.Comparator;

public class ID_Comparator implements Comparator<StudentDetailsPOJO> {
    @Override
    public int compare(StudentDetailsPOJO t1, StudentDetailsPOJO t2) {
        if(t1.getId()==t2.getId()){
            return 0;
        }
        else if(t1.getId()>t2.getId()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
