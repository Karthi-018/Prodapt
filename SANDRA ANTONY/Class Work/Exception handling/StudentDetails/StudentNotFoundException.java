public class StudentNotFoundException extends Exception
{
    StudentNotFoundException(int sId)
    {
        System.out.println(sId+" Not there");
    }
}
