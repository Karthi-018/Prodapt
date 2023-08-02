import java.util.*;
class Student_details {
        Student s[] = new Student[10];
        void student_Details()
        {
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<2;i++)
            {
                System.out.println("Enter id");
                int id = sc.nextInt();
                System.out.println("Enter name");
                String name = sc.next();
                System.out.println("Enter marks");
                int marks=sc.nextInt();
                Student obj=new Student(id,name,marks);
                s[i]=obj;
            }

        }
        public Student find_student(int id)
        {

            Student a= null;
            for(int i=0;i<s.length;i++)
            {
                if(s[i].getSid()==id)
                {
                    a=s[i];
                    break;
                }
            }
            return a;
        }
    }
public class Main1 extends Exception{
    Main1(int id){
        System.out.println("Employee "+id+" not found");
    }
    public static void main(String[] args) throws Main1{
        Student_details sd = new Student_details();
        sd.student_Details();
        System.out.println("Enter the employee Id:");
        Scanner s1 = new Scanner(System.in);
        int id=s1.nextInt();
        //System.out.println("i am here 3");
        Student y=sd.find_student(id);
        //System.out.println("i am here 4");
        if(y==null){
            throw new Main1(id);
        }
        else{
            System.out.println(y);
        }

    }
}
