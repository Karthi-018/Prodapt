import java.util.Scanner;
class Greatest
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int n[]=new int[num];
for(int i=0;i<num;i++)
{
n[i]=sc.nextInt();
}
int max=n[0];
for(int i=0;i<num;i++)
{
if(n[i]>max)
{
max=n[i];
}

}
System.out.println(max);
}
}


