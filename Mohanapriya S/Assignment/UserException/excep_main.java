import java.util.*;
class excep_main
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
excep_main ex=new excep_main();
excep arr[]=new excep[5];
excep s1=new excep(61,"Mohana",85);
arr[0]=s1;
excep s2=new excep(62,"Nandhini",80);
arr[1]=s2;
excep s3=new excep(63,"Naveen Aanath",90);
arr[2]=s3;
excep s4=new excep(64, "Naveen kumar",70);
arr[3]=s4;
excep s5=new excep(65,"Nithish",67);
arr[4]=s5;
String na=s.next();
try
{
ex.search(na,arr);
}
catch(Exception e)
{
System.out.println(e);
}
}

public void search(String na,excep arr[] )throws StudentNotFoundException 
{
    int flag=0;
for(int i=0;i<5;i++)
{
if(arr[i].getename().equals(na))
{
System.out.println("The Student number is : "+(i+1));
flag=1;
break;
}
}
if (flag==0)
{
throw new StudentNotFoundException(na);
}
}
}



