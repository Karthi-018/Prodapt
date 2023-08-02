class StudentNotFoundException extends Exception
{
StudentNotFoundException(String na)
{
System.out.println(na +"Not present in our Database");
}
}