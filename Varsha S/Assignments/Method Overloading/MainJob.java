class Job
{

void duty(String name, String skillset1, String skillset2, String skillset3)
{
System.out.println("Hello " + name + "! You will be trained in " + skillset1 + "," + skillset2 + " and " + skillset3);
}

void duty(String name, int empid, String client)
{
System.out.println("Hi " + name + " with Id_No " + empid + " from Dev team! You will be working in a project for " + client);
}

void duty(String name, String college_name, String date)
{
System.out.println("Greeting " + name + "! Campus hiring process for " + college_name + " starts from " + date);
}
}

class MainJob
{

public static void main(String args[])
{
Job j = new Job();
j.duty("ABC", "Java", "Database", "Telecom");
j.duty("PQR", 496, "Google");
j.duty("XYZ", "Sairam College", "2nd August");
}

}