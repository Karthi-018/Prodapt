import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<StudentDetails> student=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Details");
        System.out.println("Id"+"   "+"Name"+"   "+"Marks");
        for(int i=0;i<5;i++)
        {
            student.add(new StudentDetails(sc.nextInt(), sc.next(),sc.nextInt()));
        }
        int choice= sc.nextInt();
        Comparator<StudentDetails> name=Comparator.comparing(StudentDetails::getName).thenComparing(StudentDetails::getId);
        Set<StudentDetails> uniqueDetails=new TreeSet<>(name);
        uniqueDetails.addAll(student);
        List<StudentDetails> finalList=new ArrayList<>(uniqueDetails);
        switch (choice){
            case 1:
                //student names in ascending order
                Collections.sort(finalList, (s1, s2) -> s1.getName().compareTo(s2.getName()));
                break;
            case 2:
                /*finalList.sort(new Comparator<StudentDetails>(){
                    public int compare(StudentDetails s1,StudentDetails s2){
                        return s2.getName().compareTo(s1.getName());
                }
                });

                finalList.sort(new Comparator<Student>() {
                        @Override
                        public int compare(Student s1, Student s2) {
                            if (s1.getMark() > s2.getMark()) {
                                return -1;
                            } else if (s1.getMark() < s2.getMark()) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                    });*/
                //Students marks in descending order
                finalList.sort((s2, s1) -> Integer.compare(s1.getMarks(),s2.getMarks()));
                break;
            default:
                System.out.println("Invalid option");
        }
        for (StudentDetails i:finalList) {
            System.out.println(i);
        }
        }
    }
