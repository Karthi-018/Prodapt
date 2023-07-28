public class University {
    public static void main(String[] args) {
        College c =new College();
        c.Admissions();
        Professor p =new Professor();
        p.Admissions();
        Professor p1 = new AssistantProfessor();
        p1.Admissions();
        College c1 = new AssistantProfessor();
        c1.Admissions();
    }
}
class College
{
    public void Admissions()
    {
        System.out.println("Students Admissions starts soon");
        System.out.println("Entrance test will be there");
    }
}
class Professor extends College
{
    public void Admissions()
    {
        System.out.println("Hiring for new Professors");
        System.out.println("Required Java Professors ");
        System.out.println("Good knowledge on subject");
    }
}
class AssistantProfessor extends Professor
{
    public void Admissions()
    {
        System.out.println("Minimum Qualification should be done");
    }
}