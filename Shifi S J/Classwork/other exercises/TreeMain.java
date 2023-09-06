import java.util.*;

public class TreeMain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            studentList.add(new StudentTreePojo(sc.nextInt(), sc.next(), sc.nextInt()));
        }
        System.out.println("1. Sort according to names in ascending order\n2. Sort according to marks in descending order\nEnter choice : ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
            {
                Comparator<StudentTreePojo> stuname = Comparator.comparing(StudentTreePojo::getSname);
                Set<StudentTreePojo> studentSet = new TreeSet<>(stuname);
                studentSet.addAll(studentList);
                List<Student> studentList1 = new ArrayList<>(studentSet);
                System.out.println(studentList1);
                break;
            }

            case 2:
            {
                Comparator<StudentTreePojo> stuid = Comparator.comparing(StudentTreePojo::getSid).reversed();
                Set<StudentTreePojo> studentSet = new TreeSet<>(stuid);
                studentSet.addAll(studentList);
                List<Student> studentList1 = new ArrayList<>(studentSet);
                System.out.println(studentList1);
                break;
            }

            default:
                System.out.println("Invalid");

        }
    }
}
