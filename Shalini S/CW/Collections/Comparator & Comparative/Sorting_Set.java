import java.util.*;
public class Sorting_Set {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student_Pojo> stud = new ArrayList<Student_Pojo>();
        stud.add(new Student_Pojo("ram", 101, 98));
        stud.add(new Student_Pojo("sita", 102, 88));
        stud.add(new Student_Pojo("alvin", 103, 80));
        stud.add(new Student_Pojo("sita", 102, 88));

        System.out.println("1.To sort the student list based on Name in ascending order");
        System.out.println("2.To sort the student list based on Marks in descending order");
        int n = sc.nextInt();
        if (n == 1) {
            Set<Student_Pojo> sortedSet = new TreeSet<>(Comparator.comparing(Student_Pojo::getName));

            // Adding all students from the list to the TreeSet
            sortedSet.addAll(stud);

            // Converting the sortedSet back to the ArrayList
            stud = new ArrayList<>(sortedSet);

            // Displaying the sorted list
            for (Student_Pojo student : stud) {
                System.out.println(student);
            }

        }
        else if(n==2){
            Set<Student_Pojo> ss=new TreeSet<>(Comparator.comparing(Student_Pojo::getMarks).reversed());
            ss.addAll(stud);
            stud=new ArrayList<>(ss);
            for (Student_Pojo student : stud) {
                System.out.println(student);
            }
        }
        else{
            System.out.println("Invaid Input");
        }
    }
}
