import java.util.ArrayList;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class Sortt {
    public static void main(String args[]){
        Random r=new Random(100);

        Scanner sc = new Scanner(System.in);
        //Set<String> GFG = new HashSet<>();
        //Set<Integer> df = new HashSet<>();
        //Set<Integer> ghh = new HashSet<>();
        Set<students> slist = new LinkedHashSet<>();


        for (int i=0;i<10;i++){
            //GFG.add("Student"+i);
            //df.add(i);
            //ghh.add(r.nextInt(100));
            slist.add(new students((100+i),"student"+(i+1)
                    ,r.nextInt(100)));

        }
        //slist.add(new students(101,"student 1", 34));
        //System.out.println(slist);
        System.out.println("Enter your choice");
        System.out.println("1--> to sort the marks in ascending order");
        System.out.println("2--> to sort the name in desending order");
        int key= sc.nextInt();
        ArrayList<students> array = new ArrayList<>(slist);
        //System.out.println(array);
        switch(key){
            case 1:

                array.sort(new Comparator<students>() {
                    @Override
                    public int compare(students s1, students s2) {
                        if (s1.marks> s2.marks){
                            return -1;

                        }

                        return 0;
                    }

                });
                System.out.println(array);
                break;



            case 2:
                ArrayList<students> dsd = new ArrayList<>(slist);
                dsd.sort(new Comparator<students>() {
                    @Override
                    public int compare(students s1, students s2) {
                        return s1.sname.compareTo(s2.sname);
                    }
                });
                System.out.println(dsd);
                break;

        }



    }

}
