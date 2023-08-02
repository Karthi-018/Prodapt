import java.util.*;
public class Sorting {
    public static void main(String atgs[]){
        Set data=new LinkedHashSet();
        TreeSet <String> na=new TreeSet<>();
        Set <Integer> m=new LinkedHashSet<Integer>();
        TreeSet <Integer> n=new TreeSet<>();
        TreeSet <Integer> x=(TreeSet<Integer>)n.descendingSet();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("Enter id:");
            int id=sc.nextInt();
            System.out.println("Enter named:");
            String name=sc.next();
            System.out.println("Enter marks:");
            int mark=sc.nextInt();
            data.add(new Student_Pojo(name,id,mark));
            na.add(name);
            n.add(mark);
        }
        System.out.println("The names in Ascending order are:");
        System.out.println(na);
        System.out.println("The marks in Descending order are:");
        System.out.println(x);
    }

}
