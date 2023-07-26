import java.util.Scanner;
class BubbleSort
{
public static void main(String[] args)
{
int temp;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int n[]=new int[num];
for(int i=0;i<num;i++)
{
n[i]=sc.nextInt();
}
for(int i=0;i<num-1;i++)
{
for(int j=i+1;j<num;j++)
{
if(n[i]>n[j])
{
temp=n[i];
n[i]=n[j];
n[j]=temp;
}
}
}
for(int i=0;i<num;i++)
{
System.out.println(n[i]);
}
}
}