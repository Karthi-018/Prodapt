import java.util.*;
class StudArray
{
String name;
int id;

StudArray(){}

StudArray(String name,int id)
{
this.name = name;
this.id = id;
}

public void display(StudArray...sa)
{
for(StudArray i:sa)
{
System.out.println(i);
}
}

public String toString()
{
return name+" "+id;
}

public static void main(String args[])
{

String s_name;
int s_id;
Scanner sc = new Scanner(System.in);

// create an array to store ind students detail

StudArray sd[] = new StudArray[2];

for(int i=0;i<2;i++)
{
s_name = sc.next();
s_id = sc.nextInt();

// After getting input we need to create an object to store the attributes of ind student

StudArray o = new StudArray(s_name,s_id);
sd[i]=o;
}

// After creating an object to array it now has to display the attributes using vararg method

StudArray s = new StudArray();
s.display(sd);
/*for(int i=0;i<2;i++){
    System.out.println(sd[i]);
}*/

}
}