import java.util.*;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        new Student(101,"sai", 99);
        new Student(102,"zzz", 87);
        new Student(103,"hhh", 76);
        new Student(104,"gfd", 78);
        new Student(103,"eer", 90);
        new Student(106,"rqe", 55);
        new Student(107,"ate", 84);
        new Student(101,"sai", 99);
        new Student(109,"rem", 78);
        new Student(110,"yem", 73);

        int choice = 0;
        while (choice != 3) {
            System.out.println("1->SORT DATA BY NAME");
            System.out.println("2->SORT DATA IN DESCENDING ORDER");
            System.out.println("3->EXIT");
            System.out.println("Enter choice");
            choice = sc.nextInt();
            List<Student> al = Student.data;
            switch (choice) {
                case 1:

                    al.sort(new Comparator<Student>() {
                        @Override
                        public int compare(Student student, Student t1) {
                            return student.getName().compareTo(t1.getName());
                            // less -1
                            // more 1
                            // 0
                        }
                    });
                    break;
                case 2:
                    al.sort(new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if (o1.getMark() > o2.getMark()) {
                                return -1;
                            } else if (o1.getMark() < o2.getMark()) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                    });

            }
            for (Student s : Student.data) {
                System.out.println(s);
            }
        }
    }
}
