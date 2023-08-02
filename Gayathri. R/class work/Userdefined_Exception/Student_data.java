import java.util.*;
class Student_data extends Exception
{
/*Student_data(int searchid)
{
    System.out.println(searchid+"Searching student is not found");
}*/

public static void main(String a[]) throws StudentPojo
{
StudentPojo SArray[]=new StudentPojo[5];

for(int i=0;i<5;i++)
{
SArray[i]=new StudentPojo(1+(i),100*(i+1),"student"+(i+1));

}
System.out.println("enter ther search id");
Scanner s=new Scanner(System.in);
int searchkey=s.nextInt();
int flag=0;
for(int i=0;i<5;i++)
{
    if(SArray[i].getStu_id()==searchkey)
    {
     System.out.println("the Student details is");
     System.out.println(SArray[i]);
     flag=1;
    }
    
}

    if(flag==0)
    {
        throw new StudentPojo(searchkey);
    }


}
}