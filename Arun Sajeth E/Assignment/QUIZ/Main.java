package quiz;
import java.util.*;

class Main
{
	static Scanner s = new Scanner(System.in);
	
	static int total=1;
	
	public static void switchQuest()
	{
		switch(total)
		{
			case 1:
				System.out.print("\n1. Number of primitive data types in Java are?");
				System.out.println("\na)6  \nb)7  \nc)8  \nd)9");
				Quest_Service.choiceGetting();

			case 2:
				System.out.print("\n2. What is the size of float and double in java?");
				System.out.println("\na)32 and 64  \nb)32 and 32  \nc)64 and 64  \nd)64 and 32");
				Quest_Service.choiceGetting();

			case 3:
				System.out.print("\n3. Arrays in java are?");
				System.out.println("\na)Object references  \nb)Objects  \nc)Primitive data type  \nd)None");
				Quest_Service.choiceGetting();

			case 4:
				System.out.print("\n4. When is the object created with new keyword?");
				System.out.println("\na)At run time  \nb)At complie time  \nc)Depends on code  \nd)None ");
				Quest_Service.choiceGetting();

			case 5:
				System.out.print("\n5. Identify the return type of a method that doesn't return any value");
				System.out.println("\na)int  \nb)void  \nc)double  \nd)String");
				Quest_Service.choiceGetting();

			case 6:
				System.out.print("\n6. Identify the corrected definition of a package");
				System.out.println("\na)Package is collection of interface  \nb)Package is collection of classes  \nc)Package is collection of class and interface  \nd)None ");
				Quest_Service.choiceGetting();

			case 7:
				System.out.print("\n7. In which of the following is toString() method defined?");
				System.out.println("\na)java.lang.Object  \nb)java.lang.String  \nc)java.lang.util \nd)None");
				Quest_Service.choiceGetting();

			case 8:
				System.out.print("\n8. compareTo() returns");
				System.out.println("\na)True  \nb)False  \nc)An int value  \nd)None ");
				Quest_Service.choiceGetting();

			case 9:
				System.out.print("\n9. Total constructor string class have?");
				System.out.println("\na)3  \nb)7  \nc)13  \nd)20 ");
				Quest_Service.choiceGetting();

			case 10:
				System.out.print("\n10. Identify the modifier which cannot be used for constructor.");
				System.out.println("\na)public  \nb)private  \nc)protected  \nd)static ");
				Quest_Service.choiceGetting();
				break;
		}
	}

	public static void main(String[] a)
	{
		System.out.println("\n****** QUIZ START ********");
		switchQuest();
		System.out.println();
		Quest_Service.markDisplay();
		System.out.println("\n****** QUIZ ENDS ********");
	}
}
		
		