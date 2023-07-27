class Sairam
{
void count()
{
System.out.println("Department-wise Student Information");
}
}

class IT extends Sairam
{
void count()
{
//System.out.prinln("Information Technology");
System.out.println("Total number of students : 160");
System.out.println("Number of students placed : 140");
System.out.println("Number of students not placed : 15");
System.out.println("Higher studies : 5");
}
}

class CSE extends Sairam
{
void count()
{
//System.out.prinln("Computer Science");
System.out.println("Total number of students : 165");
System.out.println("Number of students placed : 145");
System.out.println("Number of students not placed : 20");
System.out.println("Higher studies : 10");
}
}

class ECE extends Sairam
{
void count()
{
//System.out.prinln("Electronics and Communication");
System.out.println("Total number of students : 140");
System.out.println("Number of students placed : 100");
System.out.println("Number of students not placed : 25");
System.out.println("Higher studies : 15");
}
}

class EEE extends Sairam
{
void count()
{
//System.out.prinln("Electrical and Electronics");
System.out.println("Total number of students : 110");
System.out.println("Number of students placed : 60");
System.out.println("Number of students not placed : 46");
System.out.println("Higher studies : 4");
}
}

class StudentCount
{
public static void main(String args[])
{

Sairam s = new Sairam();
s.count();

System.out.println("Information Technology");
IT i = new IT();
i.count();

System.out.println("Computer Science");
CSE c = new CSE();
c.count();

System.out.println("Electronics and Communication");
ECE ec = new ECE();
ec.count();

System.out.println("Electrical and Electronics");
EEE ee = new EEE();
ee.count();
}
}
