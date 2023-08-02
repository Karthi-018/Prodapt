import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student {
   // private static int idgen=100;
    private int Sid;
    private String name;
    private int mark;


     public Student(int Sid, String name, int mark) {
         //int s1 = set.size();
         //set.add(Sid);
         //int s2 = set.size();
         //if(s1!=s2){
             this.Sid = Sid;
             this.name = name;
             this.mark = mark;
             //data.add(this);
         }
         /*else{
             System.out.println("Cant add same guy again");
         }*/


     public int getSid() {
         return Sid;
     }
     public void setSid(int Sid){
         this.Sid=Sid;

     }


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getMark() {
         return mark;
     }

     public void setMark(int mark) {
         this.mark = mark;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "Sid=" + Sid +
                 ", name='" + name + '\'' +
                 ", mark=" + mark +
                 '}';
     }
 }
