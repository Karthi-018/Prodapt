import java.util.*;
public class ForEachwithCondition {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.forEach(n->{
            if(n%2==0) System.out.println(n);
        });
