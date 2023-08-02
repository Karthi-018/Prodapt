import java.util.Scanner;
class quizes
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("1)Who is the CEO of Google?");
	System.out.println("\nA.sundar pitchai \nB.mukesh ambani \nC.virat kholi \nD.modi");
	System.out.println("ENTER YOUR OPTION:");
	String S1=sc.next();
	if(S1.equals("A")){
		System.out.println("Your answer is correct");
	}
	else{
		System.out.println("Incorrect");
	}


	System.out.println("2)Elections to panchayats in state are regulated by");
	System.out.println("\nA.Gram panchayat \nB.Nagar Nigam \nC.Election Commission of India \nD.State Election Commission");
	System.out.println("ENTER YOUR OPTION:");
	String S2=sc.next();
	if(S2.equals("D")){
		System.out.println("Your answer is correct");
	}
	else{
		System.out.println("Incorrect");
	}

	
	System.out.println("3)Which of the given cities is located on the bank of river Ganga?");
	System.out.println("\nA.Patna \nB.Gwalior \nC.Bhopal \nD.Mathura");
	System.out.println("ENTER YOUR OPTION:");
	String S3=sc.next();
	if(S3.equals("A")){
		System.out.println("Your answer is correct");
	}
	else{
		System.out.println("Incorrect");
	}


	System.out.println("4)Which of the given is a disease caused by protozoa?");
	System.out.println("\nA.Cancer \nB.Typhoid \nC.Kala-azar \nD.Chicken Pox");
	System.out.println("ENTER YOUR OPTION:");
	String S4=sc.next();
	if(S4.equals("C")){
		System.out.println("Your answer is correct");
	}
	else{
		System.out.println("Incorrect");
	}

	System.out.println("5)Digestion of food in human beings begins in which part of the alimentary canal?");
	System.out.println("\nA.Liver \nB.Kidney \nC.Mouth \nD.Large intestine");
	System.out.println("ENTER YOUR OPTION:");
	String S5=sc.next();
	
	if(S5.equals("C")){
		System.out.println("Your answer is correct");
	}
	else{
		System.out.println("Incorrect");
		
	}
	
	
	System.out.println("6)How many bones in your body?");
	System.out.println("\nA.200 \nB.206 \nC.300 \nD.250");
	System.out.println("ENTER YOUR OPTION:");
	int S6=sc.nextInt();
	if(S6==206){
		System.out.println("Your answer is correct");
	}
	else{
		System.out.println("Incorrect");
	}

	System.out.println("6)How many Primitive data types are there in java?");
	System.out.println("\nA.8 \nB.2 \nC.3 \nD.25");
	System.out.println("ENTER YOUR OPTION:");
	int S7=sc.nextInt();
	if(S7==8){
		System.out.println("Your answer is correct");
	}
	else{
		System.out.println("Incorrect");
	}
	
	System.out.println("8)Which of these cannot be used for a variable name in Java?");
	System.out.println("\nA.identifier & keyword \nB.identifier \nC.keyword \nD.none of the mentioned");
	System.out.println("ENTER YOUR OPTION:");
	String S8=sc.next();
	if(S8.equals("C")){
		System.out.println("Your answer is correct");
	}
	else{
		System.out.println("Incorrect");
	}
	System.out.println("9)Which one of the following is not a Java feature?");
	System.out.println("\nA.Object-oriented \nB.Use of pointers \nC.Portable \n.Dynamic and Extensible");
	System.out.println("ENTER YOUR OPTION:");
	String S9=sc.next();
	if(S9.equals("B")){
		System.out.println("Your answer is correct");
	}
	else{
		System.out.println("Incorrect");
	}
	System.out.println("10)Which component is used to compile, debug and execute the java programs?");
	System.out.println("\nA.JRE \nB.JIT \nC.JDK \nD.JVM");
	System.out.println("ENTER YOUR OPTION:");
	String S10=sc.next();
	if(S10.equals("C")){
		System.out.println("Your answer is correct");
	}
	else{
		System.out.println("Incorrect");
	}

	
}
}