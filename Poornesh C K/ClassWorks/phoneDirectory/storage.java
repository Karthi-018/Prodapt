
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;
public class storage {
    public static void main(String args[]){
        //Random r=new Random(9);
        Scanner sc = new Scanner(System.in);
        List<directory> phonebook= new ArrayList<>();
        phonebook.add(new directory("aaa","9025678191"));
        phonebook.add(new directory("bbb","9025678661"));
        phonebook.add(new directory("ccc","9025634521"));
        phonebook.add(new directory("ddd","9425678191"));
        phonebook.add(new directory("eee","9525678191"));
        System.out.println("welcome director:");
        System.out.println("enter name to search");
        String a= sc.next();
        //new directory(sc.next(),);
        Iterator<directory> i= phonebook.iterator();
        while(i.hasNext()){
             directory ph= i.next();
             if((ph.getName()).equals(a)){
                System.out.println(ph.getNo());

             }



        }


    }
}
