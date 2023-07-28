import java.util.*;
abstract class Age
{
int age;
abstract void calculate(int age);
}

class Infant extends Age
{
int age;
void calculate(int age)
{
if(age>=0 && age<2)
{
System.out.println("Infant");
}
else
{
System.out.println("Not an Infant");
}
}
}

class Child extends Age
{
int age;
void calculate(int age)
{
if(age>=2 && age<18)
{
System.out.println("Child");
}
else
{
System.out.println("Not a Child");
}
}
}

class Adult extends Age
{
int age;
void calculate(int age)
{
if(age>=18 && age<60)
{
System.out.println("Adult");
}
else
{
System.out.println("Not an Adult");
}
}
}

class Senior_Citizen extends Age
{
int age;
void calculate(int age)
{
if(age>=60)
{
System.out.println("Senior Citizen");
}
else
{
System.out.println("Not a Senior Citizen");
}
}
}

class MainAge
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int num = sc.nextInt();
Age ob = new Infant();
ob.calculate(num);

num = sc.nextInt();
Age ob1 = new Child();
ob1.calculate(num);

num = sc.nextInt();
Age ob2 = new Adult();
ob2.calculate(num);

num = sc.nextInt();
Age ob3 = new Senior_Citizen();
ob3.calculate(num);

}

}




