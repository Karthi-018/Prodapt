class StudentNotFoundException extends Exception
{
StudentNotFoundException(int sid)
{
System.out.println(sid + " is not found");
}
}