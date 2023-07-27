class Degree
{

void education(String a1, String a2, String a3, String a4)
{
System.out.println("Cut off for Engineering: Average of " + a1 + "," + a2 + "," + a3 + "," + a4);
}

void education(String b1, String b2, String b3)
{
System.out.println("Cut off for Arts: Average of " + b1 + "," + b2 + "," + b3);
}

void education(String c1, String c2)
{
System.out.println("Cut off for MBBS: Average of " + c1 + "," + c2);
}
}

class MainDegree
{

public static void main(String args[])
{
Degree d = new Degree();
d.education("Computer Science","General Maths","Physics","Chemistry");
d.education("Commerce","Business Maths","Economics");
d.education("Biology","Maths");
}
}