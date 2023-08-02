import java.util.Scanner;
class mcqquestions
{
	public static void main(String args[])
	{
		char q='"';
		int c=0;
		String a[]=new String[10];
		char ans[]=new char[10];
		char crtans[]=new char[10];
		Scanner sc= new Scanner(System.in);
		a[0]="1. Number of primitive data types in Java are?\nA. 6\nB. 7\nC. 8\nD. 9";	
		a[1]="2. Find the output of the following code.\nint Integer = 24;\nchar String  = "+q+"I"+q+";\nSystem.out.print(Integer);\nSystem.out.print(String);?\nA. Compiler Error\nB. Throws Exception\nC. I\nD. 24I";	
		a[2]="3. Automatic type conversion is possible in which of the possible cases?\nA. Byte to int \nB. Int to long\nC. Long to int\nD. Short to int";
		a[3]="4. What is the size of float and double in java?\nA. 32 and 64\nB. 32 and 32\nC. 64 and 32\nD. 64 and 64";
		a[4]="5. Select the valid statement.\nA. char[] ch=new char(5)\nB. char[] ch=new char[5]\nC. char[] ch=new char()\nD. char ch=new char[]";
		a[5]="6. Arrays in java are-\nA. Object references \nB. object\nC. primitive data type\nD. None";
		a[6]="7. _____ is used to find and fix bugs in the Java programs.\nA. JVM \nB. JRE\nC. JDK\nD. JDB";
		a[7]="8. What is the return type of the hashCode() method in the Object class?\nA. Object \nB. int\nC. long\nD. void";
		a[8]="9. What does the expression float a = 35 / 0 return?\nA. 0 \nB. Not a Number\nC. Infinity\nD. Run time Exception";
		a[9]="10. Evaluate the following Java expression, if x=3, y=5, and z=10:\n++z + y - y + z + x++\nA. 24 \nB. 23\nC. 20\nD. 25";
		
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
			ans[i]=sc.next().charAt(0);
		}
		
		crtans[0]='C';
		crtans[1]='D';
		crtans[2]='B';
		crtans[3]='A';
		crtans[4]='B';
		crtans[5]='B';
		crtans[6]='D';
		crtans[7]='B';
		crtans[8]='C';
		crtans[9]='D';
		
		for(int i=0;i<10;i++)
		{
			if(ans[i]==crtans[i])
			{
				c++;
			}
		}
		System.out.println("You have answered "+c+" questions correctly");
		for(int i=1;i<=10;i++)
		{	
			if(ans[i]!=crtans[i])
			{
				System.out.println("Correct answer for Number "+i+" question is "+crtans[i]);
			}
		} 
	}
}
				
