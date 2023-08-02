public class StudentNotFoundException extends Exception
{
    StudentNotFoundException(int sId)
    {
        System.out.println("Student id "+sId+" not found.");
    }
}
