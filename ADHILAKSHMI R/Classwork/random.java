import java.util.*;
import java.util.stream.*;  
class random{
public static void main(String args[]){
ArrayList<Integer> data=new ArrayList<Integer>();
Random ran=new Random(); 
for(int i=0;i<10;i++){
data.add(ran.nextInt(50));
}
Stream<Integer> s=data.stream();
Stream<Integer>  s1=s.filter(n->n%2==0);
Stream<Integer>  s2=s1.map(n->n*2);
int result=s2.reduce(0,(t,n)->t+n);
System.out.println(result);

}
}


