import java.util.Scanner;

public class StudentException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] stuarr = {new Student(101, "sneha", 1000), new Student(102, "shalini", 1000),new Student(103, "arun", 1000),new Student(104, "hari", 1000),new Student(105, "varsha", 1000)};
tE
        System.out.println("Enter a student Id");
        int studentId= sc.nextInt();
        Student detailsFound=null;
        for(Student i:stuarr){
          if(i.getSid()==studentId){
              detailsFound=i;
              break;
          }
        }
        if(detailsFound!=null){
            System.out.println("Student Details: ");
            System.out.println("Id:"+detailsFound.getSid());
            System.out.println("Name:"+detailsFound.getsName());
            System.out.println("Marks:"+detailsFound.getsMark());
        }
        else {
            try {
                throw new StudentIdNotFoundException(studentId);
            }
            catch (StudentIdNotFoundException e)
            {
                System.out.println("Error:"+e.getMessage());
            }
        }

    }
}

class StudentIdNotFoundException extends Exception{
    public  StudentIdNotFoundException(int id)
    {
        System.out.println("Student id "+id+" not found");
    }
}
