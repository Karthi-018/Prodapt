import java.util.Scanner;

class Quiz
{
	public static void main(String args[])
	{
		char q='"';
		int c=0;
		String arr[]=new String[10];
		char answer[]=new char[10];
		char crtanswer[]=new char[10];

		Scanner sc= new Scanner(System.in);

		arr[0]="1. _____ is used to find and fix bugs in the Java programs.\nA. JVM \nB. JRE\nC. JDK\nD. JDB";	
		arr[1]="2. Find the output of the following code.\nint Integer = 24;\nchar String  = "+q+"I"+q+";\nSystem.out.print(Integer);\nSystem.out.print(String);?\nA. Compiler Error\nB. Throws Exception\nC. I\nD. 24I";	
		arr[2]="3. Automatic type conversion is possible in which of the possible cases?\nA. Byte to int \nB. Int to long\nC. Long to int\nD. Short to int";

		arr[3]="4. What is the size of float and double in java?\nA. 32 and 64\nB. 32 and 32\nC. 64 and 32\nD. 64 and 64";

		arr[4]="5. Evaluate the following Java expression, if x=3, y=5, and z=10:\n++z + y - y + z + x++\nA. 24 \nB. 23\nC. 20\nD. 25";

		arr[5]="6. Arrays in java are-\nA. Object references \nB. object\nC. primitive data type\nD. None";

		arr[6]="7. Number of primitive data types in Java are?\nA. 6\nB. 7\nC. 8\nD. 9";

		arr[7]="8. What is the return type of the hashCode() method in the Object class?\nA. Object \nB. int\nC. long\nD. void";

		arr[8]="9. What does the expression float a = 35 / 0 return?\nA. 0 \nB. Not a Number\nC. Infinity\nD. Run time Exception";

		arr[9]="10. Select the valid statement.\nA. char[] ch=new char(5)\nB. char[] ch=new char[5]\nC. char[] ch=new char()\nD. char ch=new char[]";
		
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);
			answer[i]=sc.next().charAt(0);
		}
		
		crtanswer[0]='B';
		crtanswer[1]='D';
		crtanswer[2]='B';
		crtanswer[3]='A';
		crtanswer[4]='B';
		crtanswer[5]='D';
		crtanswer[6]='D';
		crtanswer[7]='C';
		crtanswer[8]='C';
		crtanswer[9]='B';
		
		for(int i=0;i<10;i++)
		{
			if(answer[i]==crtanswer[i])
			{
				c++;
			}
		}
		System.out.println("You have answered "+c+" questions correctly");
		for(int i=1;i<=10;i++)
		{	
			if(answer[i]!=crtanswer[i])
			{
				System.out.println("Correct answer for Number "+i+" question is "+crtanswer[i]);
			}
		} 
	}
}