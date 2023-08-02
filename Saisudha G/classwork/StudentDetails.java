import java.util.*;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Student> set = new HashSet<>();
        Student s1=new Student(101,"sai", 99);
        Student s2=new Student(102,"zzz", 87);
        Student s3=new Student(103,"hhh", 76);
        Student s4=new Student(104,"gfd", 78);
        Student s5=new Student(103,"eer", 90);
        Student s6=new Student(106,"rqe", 55);
        Student s7=new Student(107,"ate", 84);
        Student s8=new Student(101,"sai", 99);
        Student s9=new Student(109,"rem", 78);
        Student s10=new Student(110,"yem", 73);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s3);
        set.add(s1);
        set.add(s5);
        set.add(s6);
        set.add(s7);
        set.add(s8);
        set.add(s9);
        set.add(s10);




            System.out.println("1->SORT DATA BY NAME");
            System.out.println("2->SORT DATA IN DESCENDING ORDER");
            System.out.println("3->EXIT");
            System.out.println("Enter choice");
            int choice = sc.nextInt();
            List<Student> al = new ArrayList<>();
            switch (choice) {
                case 1:

                    /*al.sort(new Comparator<Student>() {
                        @Override
                        public int compare(Student student, Student t1) {
                            return student.getName().compareTo(t1.getName());
                            // less -1
                            // more 1
                            // 0
                        }
                    });
                    break;*/

                    al.sort((t1, t2) -> (t1.getName().compareTo(t2.getName())));
                    al.forEach(System.out::println);
                    break;
                case 2:
                    /*al.sort(new Comparator<Student>() {
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
                    });*/
                    al.sort((t1, t2) -> (t1.getSid()<t2.getSid())?-1:(t1.getSid()>t2.getSid())?1:0);
                    al.forEach(System.out::println);
                    break;

            }
            for (Student s : set) {
                System.out.println(s);
            }
        }
    }
}
