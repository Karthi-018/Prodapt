interface shapes{
public void area(int length,int breadth);
}
class square implements shapes{
public void area(int length,int breadth){
System.out.println("The area of square is:" +(length*breadth));
}
}
class rectangle implements shapes{
public void area(int length,int breadth){
System.out.println("The area of rectangle is:" +(length*breadth));
}
}

public class shape{
public static void main(String args[]){
shapes s=new square();
s.area(3,3);
shapes r=new rectangle();
r.area(4,5);

}
}


