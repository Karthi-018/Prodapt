import java.util.*;
class StudPojo
{
private String name;
private int id;

public int getterid()
{
return id;
}
public void setterid(int id)
{
this.id =id;
}
public String gettername()
{
return name;
}
public void settername(String name)
{
this.name= name;
}

public void display(StudPojo...sp)
{
for(StudPojo i:sp)
{
System.out.println(i);
}
}

public String toString()
{
return id+" "+name;
}
}

class StudMain1
{
public static void main(String args[])
{
int s_id ;
String s_name;

Scanner sc = new Scanner(System.in);

StudPojo sa[] = new StudPojo[2]; // Declaring array

for(int i=0;i<2;i++)
{
s_id = sc.nextInt();
s_name = sc.next();

StudPojo o = new StudPojo(); // creating an object for array to store the attributes
o.setterid(s_id);
o.settername(s_name);


sa[i]=o; // storing the object containing the attributes to the array indices

}

StudPojo po = new StudPojo();
po.display(sa);
}
}