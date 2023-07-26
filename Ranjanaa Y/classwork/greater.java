import java.util.Scanner;
class greater
{
public static void main(String args[])
{

int i,j,temp=0;
Scanner sc = new Scanner(System.in);
int a[] = new int[5];
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();   // To get array input from user 
}

//int a[] = {3,5,2,9,6}; ------- > To define an array

for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}

}
}
System.out.println(""+a[4]);
}
}