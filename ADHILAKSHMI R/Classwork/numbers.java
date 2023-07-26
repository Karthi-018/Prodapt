import java.util.Scanner;
class numbers{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int a = input.nextInt();
switch(a)
{
case 1:
System.out.println("1 2 3 4 5 6 7 8 9 10");
break;
case 2:
System.out.println("2 3 4 5 6 7 8 9 10");
break;
case 3:
System.out.println("3 4 5 6 7 8 9 10");
break;
case 4:
System.out.println("4 5 6 7 8 9 10");
break;
case 5:
System.out.println("5 6 7 8 9 10");
break;
case 6:
System.out.println("6 7 8 9 10");
break;
case 7:
System.out.println("7 8 9 10");
break;
case 8:
System.out.println("8 9 10");
break;
case 9:
System.out.println("9 10");
break;
default:
System.out.println("10");
}
}
}