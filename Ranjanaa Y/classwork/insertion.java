import java.util.*;
class insertion
{
public static void main(String args[])
{

//int a[]={6,3,4,5,9,1}; //-----> user defined array

int i,j,key;
Scanner sc = new Scanner(System.in);

int a[] = new int[5];
int n = a.length;

//get array input

for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

// logic

for(i=1;i<=n;i++)
{
key=a[i];
j=i-1;
while(j>=0 && a[j]>=key)
{
a[j+1]=a[j];
j=j-1;
}
a[j+1]=key;
}

for(i=0;i<n;i++)
{
System.out.println(a[i]+"\r");
}

}
}