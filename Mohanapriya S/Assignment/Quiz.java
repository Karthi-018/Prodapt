import java.util.*;
class Quiz
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Collections Quiz");
System.out.println( "Enter the answer from any four options to get next Question");
System.out.println("1.Which interface doesnot allows Duplicates?");
System.out.println (" A.List  B.Set  C.Map  D.SortedMap");
System.out.println("Choose the Option: ");
char Ans1=sc.next().charAt(0);
if ((Ans1=='A' )|| (Ans1== 'B') || (Ans1=='C') ||(Ans1== 'D'))
{
System.out.println("2.Which DataStructure ArrayList internally uses?");
System.out.println("A.LinkedList  B.Array  C.DoublyLinkedList  D.None");
System.out.println("Choose the Option: ");
char Ans2=sc.next().charAt(0);
if ((Ans2=='A' )|| (Ans2== 'B') || (Ans2=='C') ||(Ans2== 'D'))
{
System.out.println("3.Which Interface provides key-value pair?");
System.out.println("A.List  B.Set  C.Map  D.Collection");
System.out.println("Choose the Option: ");
char Ans3=sc.next().charAt(0);
if ((Ans3=='A' )|| (Ans3== 'B') || (Ans3=='C') ||(Ans3== 'D'))
{
System.out.println("4.What is the Implementation of List Interface?");
System.out.println("A.HashMap  B.HashSet  C.LinkedList  D.LinkedHashSet");
System.out.println("Choose the Option: ");
char Ans4=sc.next().charAt(0);
if ((Ans4=='A' )|| (Ans4== 'B') || (Ans4=='C') ||(Ans4== 'D'))
{
System.out.println("5.What are the implementation classes of the List Interface?");
System.out.println("A.LinkedList  B.ArrayList  C.Vector  D.All the above");
System.out.println("Choose the Option: ");
char Ans5=sc.next().charAt(0);
if ((Ans5=='A' )|| (Ans5== 'B') || (Ans5=='C') ||(Ans5== 'D'))
{
System.out.println("6.What are the implementation classes of the Map interface?");
System.out.println("A.HashMap  B.LinkedHashMap  C.TreeMap  D.All the above");
System.out.println("Choose the Option: ");
char Ans6=sc.next().charAt(0);
if ((Ans6=='A' )|| (Ans6== 'B') || (Ans6=='C') ||(Ans6== 'D'))
{
System.out.println("7.Which of these maintain Insertion order?");
System.out.println("A.List  B.Set  C.All  D.None");
System.out.println("Choose the Option: ");
char Ans7=sc.next().charAt(0);
if ((Ans7=='A' )|| (Ans7== 'B') || (Ans7=='C') ||(Ans7== 'D'))
{
System.out.println("8.Hashset internally uses?");
System.out.println("A.Set  B.HashMap  C.List  D.Collection");
System.out.println("Choose the Option: ");
char Ans8=sc.next().charAt(0);
if ((Ans8=='A' )|| (Ans8== 'B') || (Ans8=='C') ||(Ans8== 'D'))
{
System.out.println("9.Which Java collection class guarantees that the elements are ordered and allows duplicates?");
System.out.println("A.HashSet  B.ArrayList  C.LinkedList  D.TreeSet");
System.out.println("Choose the Option: ");
char Ans9=sc.next().charAt(0);
if ((Ans9=='A' )|| (Ans9== 'B') || (Ans9=='C') ||(Ans9== 'D'))
{
System.out.println("10.Which Java collection class guarantees that the elements are unique and do not allow duplicates? ");
System.out.println("A.HashSet  B.LinkedList  C.ArrayList  D.TreeSet");
System.out.println("Choose the Option: ");
char Ans10=sc.next().charAt(0);
if ((Ans10=='A' )|| (Ans10== 'B') || (Ans10=='C') ||(Ans10== 'D'))
{
System.out.println("The Answers are :");
System.out.println("1.Set  2.Array  3.Map  4.LinkedList  5.All the above  6.All the above  7.List  8.HashMap  9.ArrayList  10.HashSet");
}
}
}
}
}
}
}
}
}
}
}
}






