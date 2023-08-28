/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.training;

/**
 *
 * @author Karthikeyan
 */
public class Student {
    
    
    int sid;
    String sName;

    public Student() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" + "sid=" + sid + ", sName=" + sName + '}';
    }

    
    
    
}
