package GreatestNumber.program;
import java.util.*;
class BubbleSort

{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number of elements");
int n=sc.nextInt();
sc.nextLine();
System.out.println("Enter the array elements");
int arr[]=new int[n];

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("The array elements are");

for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
int temp;

for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-i-1;j++)
 {
  if(arr[j]>arr[j+1])
 {
 temp=arr[j];
 arr[j]=arr[j+1];
 arr[j+1]=temp;
 }
 }
}
System.out.println("The sorted array");
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}

}}