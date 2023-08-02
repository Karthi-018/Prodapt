public class FindStudent extends Exception{
    FindStudent(String name)
    {
        System.out.println(name + " Student not found in the database");
    }
}
