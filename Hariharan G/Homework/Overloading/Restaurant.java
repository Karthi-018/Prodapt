package assignment;
import java.util.*;
class Restaurant
{
public static void main(String args[])
{
//System.out.println("1-NonVeg");
//System.out.println("2-Veg");

Restaurant obj=new Restaurant();
Scanner sc=new Scanner(System.in);
System.out.println("select 1 for NonVeg");
System.out.println("select 2 for Veg");
int selection=sc.nextInt();
String food[]=new String[5];

for(int i=0;i<5;i++)
{
System.out.println("ENTER ITEMS");
food[i]=sc.next();
}

if(selection==1)
{
obj.order(selection,food);
}

else
{
obj.order(1,selection,food);
}

}

public void order(int selection,String...food)
{
for(String i:food)
{
System.out.println(i);
}
System.out.println(food.length+" items ordered");
}

public void order(int i,int selection,String...food)
{
for(String s:food)
{
System.out.println(s);
}

System.out.println(food.length+" items ordered");
}

}