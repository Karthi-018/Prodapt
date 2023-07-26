import java.util.*;
class VA_details
{
String d_name;
int d_id;

VA_details(String d_name,int d_id)
{
this.d_name=d_name;
this.d_id=d_id;
}

public void display(VA_details...d)
{
for(VA_details i : d)
{
System.out.println("Entered detail: "+i);
}
}

public String toString()
{
return d_id+" "+d_name;
}

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

String name = sc.nextLine();
int id = sc.nextInt();

VA_details det = new VA_details(name,id);
det.display(det);
}


}