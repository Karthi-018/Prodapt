class StudentdetailsNotFoundException extends Exception
{
StudentdetailsNotFoundException(String name)
{
System.out.println(name+" student not found in the list");
}
}